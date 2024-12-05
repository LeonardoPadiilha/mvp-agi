package com.leonardo.ms_customer.infra.gateways;

import com.leonardo.ms_customer.application.gateways.AddressGateway;
import com.leonardo.ms_customer.domain.entities.address.Address;

import java.util.List;
import java.util.Optional;

public class AddressRepositoryGateway implements AddressGateway {
    @Override
    public Address create(Address address) {
        return null;
    }

    @Override
    public List<Address> findAllAddress() {
        return List.of();
    }

    @Override
    public Optional<Address> findAddressById(Long id) {
        return Optional.empty();
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Address> findAddressByCustomerCpf(String cpf) {
        return Optional.empty();
    }
}
