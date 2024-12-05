package com.leonardo.ms_customer.application.usecases.customer.impl;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.application.usecases.customer.FindAllCustomersUseCase;
import com.leonardo.ms_customer.domain.entities.customer.Customer;

import java.util.List;

public class FindAllcustomerUseCaseImpl implements FindAllCustomersUseCase {
    private final CustomerGateway customerGateway;

    public FindAllcustomerUseCaseImpl(CustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public List<Customer> find() {
        return customerGateway.findAllCustomers();
    }
}
