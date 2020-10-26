package com.aiocdawacs.smart.pharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.repository.DistributorRepository;

@RestController("/distributor/")
public class DistributorController {

	@Autowired
	DistributorRepository distributorRepository;
	
}
