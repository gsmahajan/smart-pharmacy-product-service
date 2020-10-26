package com.aiocdawacs.smart.pharmacy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;

@Entity
@ToString
public class Pharmasist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String pharmasistName;
	String pharmasistAddress;
	String email;
	
	public Pharmasist() {
		super();
	}

	public Pharmasist(Long id, String pharmasistName, String pharmasistAddress, String email) {
		super();
		this.id = id;
		this.pharmasistName = pharmasistName;
		this.pharmasistAddress = pharmasistAddress;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPharmasistName() {
		return pharmasistName;
	}

	public void setPharmasistName(String pharmasistName) {
		this.pharmasistName = pharmasistName;
	}

	public String getPharmasistAddress() {
		return pharmasistAddress;
	}

	public void setPharmasistAddress(String pharmasistAddress) {
		this.pharmasistAddress = pharmasistAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
