package com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.Distributor;

@Repository
public interface DistributorRepository extends CrudRepository<Distributor, Long> {
	
}