package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.UpdateCustomerUseCase;
import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;
import com.leonardo.ms_customer.domain.exceptions.NotFoundException;

import static java.util.Objects.isNull;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private final CustomerGateway  customerGateway;

    public UpdateCustomerUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public void execute(Long id, Customer customer) {
        if (isNull(id) || id < 0) throw CustomValidationException.of("Customer Id",
                "cannot be null or negative");
        if (isNull(customer)) throw CustomValidationException.of("Customer", "cannot be null");

        customerGateway.findCustomerById(id)
                .orElseThrow(() -> NotFoundException.of("Customer"));

        customer.setId(id);
        customerGateway.update(customer);
    }
}
