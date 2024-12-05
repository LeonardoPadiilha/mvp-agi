package com.leonardo.ms_customer.infra.gateways;

import com.leonardo.ms_customer.application.gateways.CustomerGateway;
import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.infra.persistence.mappers.CustomerEntityMapper;
import com.leonardo.ms_customer.infra.persistence.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerRepositoryGateway implements CustomerGateway {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Autowired
    public CustomerRepositoryGateway(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
        this.customerRepository = customerRepository;
        this.customerEntityMapper = customerEntityMapper;
    }

    @Override
    public Customer create(Customer customer) {
        final var entity = customerEntityMapper.toEntity(customer);
        final var entitySaved = customerRepository.save(entity);
        return customerEntityMapper.toDomain(entitySaved);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return List.of();
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findCustomerByCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }

}
