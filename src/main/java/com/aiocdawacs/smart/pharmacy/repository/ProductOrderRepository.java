package com.aiocdawacs.smart.pharmacy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.pharmacy.model.ProductOrder;

@Repository
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {
}