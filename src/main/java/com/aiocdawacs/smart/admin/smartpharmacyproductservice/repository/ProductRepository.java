package com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    List<Product> findAll();
}
