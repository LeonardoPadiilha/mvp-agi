package com.leonardo.ms_customer.application.usecases.customer;

import com.leonardo.ms_customer.domain.entities.customer.Customer;

import java.util.List;

@FunctionalInterface
public interface FindAllCustomersUseCase {

        List<Customer> find();
}
