package com.aiocdawacs.smart.pharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aiocdawacs.smart.pharmacy.repository.PharmasistRepository;

@RestController(value = "/pharmasist/")
public class PharmasistController {

	@Autowired
	PharmasistRepository pharmasistRepository;
	
	
}