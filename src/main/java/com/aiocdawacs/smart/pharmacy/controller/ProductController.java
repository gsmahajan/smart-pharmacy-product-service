package com.aiocdawacs.smart.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.model.Product;
import com.aiocdawacs.smart.pharmacy.repository.ProductRepository;

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
    
    @GetMapping( path = "/{id}")
    public Product getProduct(@PathVariable Long id){
    	System.out.println("searching product for id="+id);
        return productRepository.findById(id).orElse(null);
    }
}
