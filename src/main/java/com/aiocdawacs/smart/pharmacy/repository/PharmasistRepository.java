package com.aiocdawacs.smart.pharmacy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.pharmacy.model.Pharmasist;

@Repository
public interface PharmasistRepository extends PagingAndSortingRepository<Pharmasist, Long> {
	
}