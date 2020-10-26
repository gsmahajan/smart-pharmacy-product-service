package com.aiocdawacs.smart.pharmacy.config;

public class ProductorderNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductorderNotFoundException(Long id) {
		super(String.format("product order with id = %d not found", id));
	}
}
