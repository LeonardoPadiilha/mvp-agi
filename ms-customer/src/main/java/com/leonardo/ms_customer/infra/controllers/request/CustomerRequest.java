package com.leonardo.ms_customer.infra.controllers.request;

public record CustomerRequest(String name, String cpf, String phone, AddressRequest address, String birthDate) {
}
