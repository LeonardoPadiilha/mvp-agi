package com.leonardo.ms_customer.infra.persistence.repositories;

import com.leonardo.ms_customer.infra.persistence.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}