package com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.Pharmasist;

@Repository
public interface PharmasistRepository extends PagingAndSortingRepository<Pharmasist, Long> {
	
}