package com.leonardo.ms_customer.domain.entities.customer;

import com.leonardo.ms_customer.domain.entities.address.Address;

import java.time.LocalDate;

public class CustomerDomain implements Customer {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String cpf;
    private String phone;
    private Address address;

    public CustomerDomain(final Long id, final String name, final LocalDate birthDate, final String cpf, final String phone, final Address address) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public Address getAdress() {
        return address;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
