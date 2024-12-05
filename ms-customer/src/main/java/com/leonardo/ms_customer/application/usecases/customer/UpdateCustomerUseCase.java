package com.leonardo.ms_customer.application.usecases.customer;

import com.leonardo.ms_customer.domain.entities.customer.Customer;

@FunctionalInterface
public interface UpdateCustomerUseCase {

    void execute(Long id, Customer customer);
}