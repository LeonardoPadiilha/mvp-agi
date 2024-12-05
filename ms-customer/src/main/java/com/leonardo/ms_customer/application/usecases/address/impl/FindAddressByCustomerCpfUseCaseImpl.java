package com.leonardo.ms_customer.application.usecases.address.impl;

import com.leonardo.ms_customer.application.gateways.AddressGateway;
import com.leonardo.ms_customer.application.usecases.address.FindAddressByCustomerCpfUseCase;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;
import com.leonardo.ms_customer.domain.exceptions.NotFoundException;

import static java.util.Objects.isNull;

public class FindAddressByCustomerCpfUseCaseImpl implements FindAddressByCustomerCpfUseCase {
    private final AddressGateway addressGateway;

    public FindAddressByCustomerCpfUseCaseImpl(com.leonardo.ms_customer.application.gateways.AddressGateway addressGateway) {
        this.addressGateway = addressGateway;
    }

    @Override
    public com.leonardo.ms_customer.domain.entities.address.Address find(String cpf) {
        if (isNull(cpf) || cpf.length() != 11) throw CustomValidationException.of("Customer CPF",
                "invalid");
        return addressGateway.findAddressByCustomerCpf(cpf)
                .orElseThrow(() -> NotFoundException.of("Customer Address"));
    }
}
