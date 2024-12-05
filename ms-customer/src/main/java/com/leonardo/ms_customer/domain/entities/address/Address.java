package com.leonardo.ms_customer.domain.entities.address;

public interface Address {

        Long getId();
        String getStreet();

        String getNumber();

        String getComplement();

        String getNeighborhood();

        String getCity();

        String getState();

        String getZipCode();
}
