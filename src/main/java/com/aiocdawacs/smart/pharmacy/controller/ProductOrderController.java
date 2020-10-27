
package com.aiocdawacs.smart.pharmacy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.config.ProductorderNotFoundException;
import com.aiocdawacs.smart.pharmacy.model.ProductOrder;
import com.aiocdawacs.smart.pharmacy.repository.ProductOrderRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/product/order")
@Api(value="smart_pharmacy", description="Product Order Distributor & Pharmacy")

public class ProductOrderController {

	@Autowired
	ProductOrderRepository productOrderRepository;

	@PostMapping("/makeOrder")
	public Optional<ProductOrder> makeOrder(@RequestBody ProductOrder o ){
		return Optional.of(this.productOrderRepository.save(o));
	}

	@GetMapping("/{orderId}")
	public ResponseEntity<ProductOrder> getOrder(@PathVariable Long orderId ) throws ProductorderNotFoundException {
		return ResponseEntity.of(Optional.ofNullable(this.productOrderRepository.findById(orderId)
				.orElseThrow(() -> new ProductorderNotFoundException(orderId))));
	}

	@GetMapping("/all")
	public List<ProductOrder> getAllOrders(){
		return (List<ProductOrder>) this.productOrderRepository.findAll();
	}
}