package com.aiocdawacs.smart.admin.smartpharmacyproductservice.controller;

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.Product;
import com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping( path = "/all")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping( path = "/add")
    public void saveProduct(@RequestBody Product productToSave){
        productRepository.save(productToSave);
    }
}
