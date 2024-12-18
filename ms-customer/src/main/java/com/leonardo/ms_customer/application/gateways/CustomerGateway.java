package com.leonardo.ms_customer.application.gateways;

import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.domain.entities.customer.CustomerDomain;

import java.util.List;
import java.util.Optional;

public interface CustomerGateway {

    Customer create(Customer customer);

    List<Customer> findAllCustomers();

    Optional<Customer> findCustomerById(Long id);

    Optional<Customer> findCustomerByCpf(String cpf);

    void update(Customer customer);

    void delete(Long id);
}
