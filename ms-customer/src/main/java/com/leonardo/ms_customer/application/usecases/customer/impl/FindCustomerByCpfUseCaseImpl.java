package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.FindCusomerByCpfUseCase;
import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;
import com.leonardo.ms_customer.domain.exceptions.NotFoundException;

import static java.util.Objects.isNull;

public class FindCustomerByCpfUseCaseImpl implements FindCusomerByCpfUseCase {

    private final CustomerGateway customerGateway;

    public FindCustomerByCpfUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public Customer find(String cpf) {
        if (isNull(cpf) || cpf.length() != 11) throw CustomValidationException.of("Customer CPF",
                "invalid");
        return customerGateway.findCustomerByCpf(cpf)
                .orElseThrow(() -> NotFoundException.of("Customer"));
    }
}
