/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.service.impl
 */
package com.gradle.example.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradle.example.dao.CustomerDao;
import com.gradle.example.dto.CustomerDto;
import com.gradle.example.modal.Customer;
import com.gradle.example.service.CustomerService;
import com.gradle.example.utill.AppConstant;

/**
 * @author Tharaka Chandralal
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerDao customerDao;
	
	/* (non-Javadoc)
	 * @see com.gradle.example.service.CustomerService#saveCustomer(com.gradle.example.dto.CustomerDto)
	 */
	@Override
	public String saveCustomer(CustomerDto customerDto) throws Exception {
		
		Customer customer = customerDao.findByNic(customerDto.getNic());
		
		if (customer != null) {
			
			return "Customer All Ready Exist . . !";
		}else {
			Customer saveCustomer = new Customer();
			saveCustomer.setCustomerId(UUID.randomUUID().toString());
			saveCustomer.setGender(customerDto.getGender());
			saveCustomer.setMobileNumber(customerDto.getMobileNumber());
			saveCustomer.setName(customerDto.getName());
			saveCustomer.setNic(customerDto.getNic());
			saveCustomer.setStatus(AppConstant.ACTIVE);
			
			customerDao.save(saveCustomer);
			
			return "Customer Saved Succsess . . !";
		}
		
	}

	/* (non-Javadoc)
	 * @see com.gradle.example.service.CustomerService#updateCustomer(com.gradle.example.dto.CustomerDto)
	 */
	@Override
	public String updateCustomer(CustomerDto customerDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gradle.example.service.CustomerService#deleteCustomer(java.lang.String)
	 */
	@Override
	public String deleteCustomer(String nic) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gradle.example.service.CustomerService#searchCustomer(java.lang.String)
	 */
	@Override
	public CustomerDto searchCustomer(String nic) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gradle.example.service.CustomerService#getAllCustomer()
	 */
	@Override
	public List<CustomerDto> getAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
