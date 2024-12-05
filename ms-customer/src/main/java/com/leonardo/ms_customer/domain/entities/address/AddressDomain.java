package com.leonardo.ms_customer.domain.entities.address;

public class AddressDomain implements Address{

    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public AddressDomain(final String street,final String number,final String complement,final String neighborhood,final String city,final String state,final String country,final String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getComplement() {
        return complement;
    }

    @Override
    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
}
