//package com.leonardo.ms_customer.infra.persistence.config;
//
//import com.leonardo.ms_customer.domain.entities.customer.CustomerDomain;
//import com.leonardo.ms_customer.infra.controllers.request.CustomerRequest;
//import com.leonardo.ms_customer.infra.persistence.entities.CustomerEntity;
//import org.modelmapper.Converter;
//import org.modelmapper.ModelMapper;
//import org.springframework.context.annotation.Bean;
//
//import java.util.function.Supplier;
//
//@org.springframework.context.annotation.Configuration
//public class Configuration {
//
//    @Bean
//    public ModelMapper modelMapper() {
////        ModelMapper modelMapper = new ModelMapper();
////        configure(modelMapper);
////        return modelMapper;
//
//        ModelMapper modelMapper = new ModelMapper();
//        // Configurar para mapear Customer para CustomerDomain
//        modelMapper.typeMap(CustomerEntity.class, CustomerDomain.class);
//        modelMapper.typeMap(CustomerDomain.class, CustomerEntity.class);
//        return modelMapper;
//    }
//
//}
