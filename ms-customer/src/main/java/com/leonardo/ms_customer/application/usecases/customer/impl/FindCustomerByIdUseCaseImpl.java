package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.FindCustomerByIdUseCase;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;
import com.leonardo.ms_customer.domain.exceptions.NotFoundException;

import static java.util.Objects.isNull;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final CustomerGateway customerGateway;

    public FindCustomerByIdUseCaseImpl(com.leonardo.ms_customer.application.gateways.CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public com.leonardo.ms_customer.domain.entities.customer.Customer find(Long id) {
        if (isNull(id) || id < 0) throw CustomValidationException.of("Customer Id",
                "cannot be null or negative");
        return customerGateway.findCustomerById(id)
                .orElseThrow(() -> NotFoundException.of("Customer"));
    }
}
