/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.controller
 */
package com.gradle.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradle.example.dto.CustomerDto;
import com.gradle.example.service.CustomerService;

/**
 * @author Tharaka Chandralal
 */
@RestController
@CrossOrigin
@RequestMapping(value="/gradle/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/saveCustomer")
	public ResponseEntity<Object>saveCustomer(@RequestBody CustomerDto customerDto){
		try {
			return new ResponseEntity<Object>(customerService.saveCustomer(customerDto),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
