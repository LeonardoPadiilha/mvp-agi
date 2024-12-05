package com.leonardo.ms_customer.infra.controllers.mappers;

import com.leonardo.ms_customer.domain.entities.customer.Customer;
import com.leonardo.ms_customer.infra.controllers.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {AddressRequestMapper.class})
public interface CustomerResponseMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "cpf", source = "cpf")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "address", source = "address")
    @Mapping(target = "birthDate", source = "birthDate")
    @Mapping(target = "phone", source = "phone")
    CustomerResponse toResponse(Customer customer);

    List<CustomerResponse> toResponses(List<Customer> customers);
}
