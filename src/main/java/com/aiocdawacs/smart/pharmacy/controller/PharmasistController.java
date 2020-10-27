package com.aiocdawacs.smart.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.model.Pharmasist;
import com.aiocdawacs.smart.pharmacy.repository.PharmasistRepository;

@RestController
@RequestMapping("/api/pharmasist")
public class PharmasistController {

	@Autowired
	PharmasistRepository pharmasistRepository;

	@GetMapping("/all")
	public List<Pharmasist> getAllDistributors(){
		return (List<Pharmasist>) this.pharmasistRepository.findAll();
	}

}
