package com.aiocdawacs.smart.admin.smartpharmacyproductservice.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	
	
    @ExceptionHandler(ProductorderNotFoundException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
    		ProductorderNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
        body.put("message", ex.getMessage());
        body.put("poweredBy", "AwacsInternational");
        
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

	/*
	 * @ExceptionHandler(NoDataFoundException.class) public ResponseEntity<Object>
	 * handleNodataFoundException( NoDataFoundException ex, WebRequest request) {
	 * 
	 * Map<String, Object> body = new LinkedHashMap<>(); body.put("timestamp",
	 * LocalDateTime.now()); body.put("message", "No cities found");
	 * 
	 * return new ResponseEntity<>(body, HttpStatus.NOT_FOUND); }
	 */

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, HttpHeaders headers, 
        HttpStatus status, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", status.value());

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());

        body.put("errors", errors);

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}