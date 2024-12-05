package com.leonardo.ms_customer.application.usecases.address;

import com.leonardo.ms_customer.domain.entities.address.Address;

@FunctionalInterface
public interface FindAddressByCustomerCpfUseCase {

        Address find(String cpf);
}
