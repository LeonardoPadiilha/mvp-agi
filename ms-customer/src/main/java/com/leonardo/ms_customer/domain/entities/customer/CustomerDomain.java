package com.leonardo.ms_customer.domain.entities.customer;

import com.leonardo.ms_customer.domain.entities.address.Address;
import com.leonardo.ms_customer.domain.exceptions.CustomValidationException;

import java.time.LocalDate;
import java.time.Period;

import static java.util.Objects.isNull;

public class CustomerDomain implements Customer {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String cpf;
    private String phone;
    private Address address;

    public CustomerDomain(String cpf, String name, Address address, String phone) {
        this.cpf = cpf;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static CustomerDomain of(final Long id, final String name, final LocalDate birthDate, final String cpf, final String phone, final Address address) {
        return new CustomerDomain(id, name, birthDate, cpf, phone, address);
    }

    private CustomerDomain(final Long id, final String name, final LocalDate birthDate, final String cpf, final String phone, final Address address) {
        this.id = idValidation(id);
        this.name = nameValidation(name);
        this.birthDate = birthDateValidation(birthDate);
        this.cpf = cpfValidation(cpf);
        this.phone = phoneValidation(phone);
        this.address = addressValidation(address);
    }

    private String phoneValidation(String phone) {
        return phone;
    }

    public CustomerDomain(final String name,
                          final String birthDate,
                          final String cpf,
                          final String phone,
                          final Address address) {
        this.name = nameValidation(name);
        this.birthDate = birthDateValidation(LocalDate.parse(birthDate));
        this.cpf = cpfValidation(cpf);
        this.phone = phoneValidation(phone);
        this.address = addressValidation(address);
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

    private static Long idValidation(final Long id) {
        if (isNull(id)) throw CustomValidationException.of("Customer Id", "cannot be null");
        if (id < 0) throw CustomValidationException.of("Customer Id", "cannot be negative");
        return id;
    }

    private static String cpfValidation(final String cpf) {
        if (isNull(cpf)) throw CustomValidationException.of("Customer CPF", "cannot be null");
        if (cpf.length() != 11) throw CustomValidationException.of("Customer CPF", "must be 11 positions");
        return cpf;
    }

    private static String nameValidation(final String name) {
        if (isNull(name)) throw CustomValidationException.of("Customer Name", "cannot be null");
        return name;
    }

    private static Address addressValidation(final Address address) {
        if (isNull(address)) throw CustomValidationException.of("Customer Address", "cannot be null");
        return address;
    }

    private static LocalDate birthDateValidation(final LocalDate birthDate) {
        if (isNull(birthDate)) throw CustomValidationException.of("Customer Birth Date", "cannot be null");
        LocalDate currentDate = LocalDate.now();
        boolean isOfLegalAge = Period.between(birthDate, currentDate).getYears() >= 18;
        if (!isOfLegalAge) throw
                CustomValidationException.of("Customer Birth Date", "must be at least 18 years ago");
        return birthDate;
    }
}
