package com.leonardo.ms_customer.infra.controllers;

import com.leonardo.ms_customer.application.usecases.customer.CreateCustomerUseCase;
import com.leonardo.ms_customer.infra.controllers.mappers.CustomerRequestMapper;
import com.leonardo.ms_customer.infra.controllers.mappers.CustomerResponseMapper;
import com.leonardo.ms_customer.infra.controllers.request.CustomerRequest;
import com.leonardo.ms_customer.infra.controllers.response.CustomerResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/api/v1"))
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final CustomerRequestMapper customerRequestMapper;
    private final CustomerRequest customerRequest;
    private final CustomerResponseMapper customerResponseMapper;

    public CustomerController(CreateCustomerUseCase createCustomerUseCase, CustomerRequestMapper customerRequestMapper, CustomerRequest customerRequest, CustomerResponseMapper customerResponseMapper) {
        this.createCustomerUseCase = createCustomerUseCase;
        this.customerRequestMapper = customerRequestMapper;
        this.customerRequest = customerRequest;
        this.customerResponseMapper = customerResponseMapper;
    }

    @PostMapping("/customers")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody final CustomerRequest request) {
        final var customer = createCustomerUseCase.execute(customerRequestMapper.toCustomer(customerRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponseMapper.toResponse(customer));
    }
}
