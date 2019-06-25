/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.service
 */
package com.gradle.example.service;

import java.util.List;

import com.gradle.example.dto.CustomerDto;

/**
 * @author Tharaka Chandralal
 */
public interface CustomerService {

	public String saveCustomer(CustomerDto customerDto)throws Exception;
	
	public String updateCustomer(CustomerDto customerDto)throws Exception;
	
	public String deleteCustomer(String nic)throws Exception;
	
	public CustomerDto searchCustomer(String nic)throws Exception;
	
	List<CustomerDto> getAllCustomer()throws Exception;
}
