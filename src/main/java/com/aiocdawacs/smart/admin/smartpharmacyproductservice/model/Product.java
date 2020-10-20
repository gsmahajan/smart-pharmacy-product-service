package com.aiocdawacs.smart.admin.smartpharmacyproductservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String price;
    String quantity;
    String distributorName;
    String genericName;

    public Product() {
    }

    public Product(Long id){
        this.id = id;
    }

    public Product(Long id, String name, String price, String quantity, String distributorName, String genericName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.distributorName = distributorName;
        this.genericName = genericName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }
}