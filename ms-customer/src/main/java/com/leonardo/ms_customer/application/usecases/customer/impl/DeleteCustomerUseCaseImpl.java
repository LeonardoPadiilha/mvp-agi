package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.DeleteCustomerUseCase;
import com.leonardo.ms_customer.application.usecases.customer.FindCustomerByIdUseCase;
import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;
import com.leonardo.ms_customer.domain.exceptions.NotFoundException;

import static java.util.Objects.isNull;

public class DeleteCustomerUseCaseImpl implements DeleteCustomerUseCase {

    private final CustomerGateway customerGateway;
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    public DeleteCustomerUseCaseImpl(CustomerGateway customerGateway, FindCustomerByIdUseCase findCustomerByIdUseCase) {
        this.customerGateway = customerGateway;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
    }

    @Override
    public void execute(Long id) {

        if (isNull(id) || id < 0) throw CustomValidationException.of("Customer Id",
                "cannot be null or negative");
        final var customer = findCustomerByIdUseCase.find(id);

        if (isNull(customer)) {
            throw NotFoundException.of("Customer");
        }
        customerGateway.delete(id);
    }
}
