package com.leonardo.ms_customer.application.gateways;

import com.leonardo.ms_customer.domain.entities.address.Address;

import java.util.List;
import java.util.Optional;

public interface AddressGateway {

    Address create(Address address);

    List<Address> findAllAddress();

    Optional<Address> findAddressById(Long id);

    void update(Address address);

    void delete(Long id);

    Optional<Address> findAddressByCustomerCpf(String cpf);
}
