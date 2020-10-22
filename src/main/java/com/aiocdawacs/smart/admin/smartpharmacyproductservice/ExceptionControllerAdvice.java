package com.aiocdawacs.smart.admin.smartpharmacyproductservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

@ControllerAdvice
public class ExceptionControllerAdvice {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(value = { Unauthorized.class })
	public ResponseEntity<Object> handleUnauthorizedException(Unauthorized ex) {
		LOGGER.error("Unauthorized Exception: ", ex.getMessage());
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleException(Exception ex) {
		LOGGER.error("Exception: ", ex.getMessage());
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
