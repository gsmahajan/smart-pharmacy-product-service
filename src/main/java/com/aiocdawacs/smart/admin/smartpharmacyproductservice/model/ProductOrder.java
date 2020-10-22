package com.aiocdawacs.smart.admin.smartpharmacyproductservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductOrder {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;

	Long productId;

	Long distributorId;

	Long pharmasistId;

	LocalDateTime creationDate;

	Integer quantity;

	Boolean orderStatus;

	public ProductOrder() {
		super();
	}

	public ProductOrder(Long id, Long productId, Long distributorId, Long pharmasistId, LocalDateTime creationDate,
			Integer quantity, Boolean orderStatus) {
		super();
		this.id = id;
		this.productId = productId;
		this.distributorId = distributorId;
		this.pharmasistId = pharmasistId;
		this.creationDate = creationDate;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getPharmasistId() {
		return pharmasistId;
	}

	public void setPharmasistId(Long pharmasistId) {
		this.pharmasistId = pharmasistId;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
}
