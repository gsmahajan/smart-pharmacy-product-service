package com.aiocdawacs.smart.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.model.Distributor;
import com.aiocdawacs.smart.pharmacy.repository.DistributorRepository;

@RestController
@RequestMapping("/api/distributor")
public class DistributorController {

	@Autowired
	DistributorRepository distributorRepository;

	@GetMapping("/all")
	public List<Distributor> getAllDistributors(){
		return (List<Distributor>) this.distributorRepository.findAll();
	}
}

