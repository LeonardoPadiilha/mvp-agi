package com.leonardo.ms_customer.infra.controllers.request;

public record AddressRequest(String street, String number, String neighborhood, String city, String state, String zipCode, String complement) {
}
