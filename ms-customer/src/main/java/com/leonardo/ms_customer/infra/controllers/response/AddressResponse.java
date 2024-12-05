package com.leonardo.ms_customer.infra.controllers.response;

public record AddressResponse(String street, String number, String neighborhood, String city, String state, String zipCode) {
}
