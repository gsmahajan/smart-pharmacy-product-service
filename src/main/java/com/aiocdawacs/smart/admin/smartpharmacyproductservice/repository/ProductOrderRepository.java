package com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.ProductOrder;

@Repository
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {

}