package com.aiocdawacs.smart.admin.smartpharmacyproductservice.controller;

import java.util.Arrays;
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

import com.aiocdawacs.smart.admin.smartpharmacyproductservice.model.ProductOrder;
import com.aiocdawacs.smart.admin.smartpharmacyproductservice.repository.ProductOrderRepository;

@RestController
@RequestMapping("/product/order")
public class ProductOrderController {

	@Autowired
	ProductOrderRepository productOrderRepository;

	@PostMapping("/makeOrder")
	public List<ProductOrder> makeOrder(@RequestBody ProductOrder o ){
		return Arrays.asList(this.productOrderRepository.save(o));
	}

	@GetMapping("/{orderId}")
	public ResponseEntity<ProductOrder> getOrder(@PathVariable Long orderId ){
		return ResponseEntity.of(Optional.ofNullable(this.productOrderRepository.findById(orderId).orElse(null)));
	}

	@GetMapping("/all")
	public List<ProductOrder> getAllOrders(){
		return (List<ProductOrder>) this.productOrderRepository.findAll();
	}
}