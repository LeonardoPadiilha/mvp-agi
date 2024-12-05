package com.leonardo.ms_customer.domain.entities.customer;

import com.leonardo.ms_customer.domain.entities.address.Address;

import java.time.LocalDate;

public interface Customer {

    String getName();

    String getCpf();

    LocalDate getBirthDate();

    String getPhone();

    Address getAdress();

    void setId(Long id);
}
