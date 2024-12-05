package com.leonardo.ms_customer.infra.persistence.mappers;

import com.leonardo.ms_customer.domain.entities.address.Address;
import com.leonardo.ms_customer.infra.persistence.entities.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import com.leonardo.ms_customer.domain.entities.address.AddressDomain;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressEntityMapper {
    @Mapping(target = "street", source = "street")
    @Mapping(target = "number", source = "number")
    @Mapping(target = "complement", source = "complement")
    @Mapping(target = "neighborhood", source = "neighborhood")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "state", source = "state")
    @Mapping(target = "zipCode", source = "zipCode")
    AddressEntity toEntity(Address address);

    default Address toDomain(final AddressEntity entity) {
        return AddressDomain.of(
                entity.getId(),
                entity.getStreet(),
                entity.getNumber(),
                entity.getComplement(),
                entity.getNeighborhood(),
                entity.getCity(),
                entity.getState(),
                entity.getZipCode()
        );
    }

    default List<Address> toDomains(final List<AddressEntity> entities) {
        return entities.stream()
                .map(this::toDomain)
                .toList();
    }

}
