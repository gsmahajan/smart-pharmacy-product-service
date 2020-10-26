package com.aiocdawacs.smart.pharmacy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table (name = "stockist_distributor")
public class Distributor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String stockistName;
	String address;
	String email;
	
	Long productId;
	Integer availableQuantity;
	
	public Distributor() {
		super();
	}
	
	public Distributor(Long id, String stockistName, String address, String email, Long productId,
			Integer availableQuantity) {
		super();
		this.id = id;
		this.stockistName = stockistName;
		this.address = address;
		this.email = email;
		this.productId = productId;
		this.availableQuantity = availableQuantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockistName() {
		return stockistName;
	}
	public void setStockistName(String stockistName) {
		this.stockistName = stockistName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
}
