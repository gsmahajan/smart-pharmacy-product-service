package com.aiocdawacs.smart.pharmacy.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.ToString;

@Entity
@ToString
public class ProductOrder {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;

	@OneToOne
	@JoinColumn( name = "productId", referencedColumnName = "id")
	Product product;

	@ManyToOne
	@JoinColumn( name = "distributorId", referencedColumnName = "id")
	Distributor distributor;

	@ManyToOne
	@JoinColumn(name = "pharmasistId", referencedColumnName = "id")
	Pharmasist pharmasist;

	LocalDateTime creationDate;

	Integer quantity;

	Boolean orderStatus;

	public ProductOrder() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Distributor getDistributor() {
		return distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	public Pharmasist getPharmasist() {
		return pharmasist;
	}

	public void setPharmasist(Pharmasist pharmasist) {
		this.pharmasist = pharmasist;
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