package com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

	@Override
	List<Product> findAll();	
}
