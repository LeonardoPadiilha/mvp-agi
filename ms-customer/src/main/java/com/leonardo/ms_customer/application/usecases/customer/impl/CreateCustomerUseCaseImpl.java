package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.CreateCustomerUseCase;
import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.domain.entities.customer.CustomerDomain;

public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

    private final CustomerGateway customerGateway;

    public CreateCustomerUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public Customer execute(Customer customer) {
        return customerGateway.create((CustomerDomain) customer);
    }

}
