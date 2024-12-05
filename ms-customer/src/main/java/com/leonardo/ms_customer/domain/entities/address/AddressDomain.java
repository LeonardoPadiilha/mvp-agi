package com.leonardo.ms_customer.domain.entities.address;

public class AddressDomain implements Address{

    private Long id;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;

    public static AddressDomain of(final Long id,final String street,final String number,final String complement,final String neighborhood,final String city,final String state,final String zipCode) {
        return new AddressDomain(id,street,number,complement,neighborhood,city,state,zipCode);
    }

    public AddressDomain(final String street, final String number, final String complement, final String neighborhood, final String city, final String state, final String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    private AddressDomain(Long id, String street, String number, String complement, String neighborhood, String city, String state, String zipCode) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public Long getId() {
        return id;
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
    public String getZipCode() {
        return zipCode;
    }
}
