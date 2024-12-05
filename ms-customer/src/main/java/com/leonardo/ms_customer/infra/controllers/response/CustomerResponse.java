package com.leonardo.ms_customer.infra.controllers.response;

public record CustomerResponse(Long id, String name, String cpf, String phone, AddressResponse address, String birthDate) {
}
