/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.dao
 */
package com.gradle.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gradle.example.modal.Customer;

/**
 * @author Tharaka Chandralal
 */
public interface CustomerDao extends JpaRepository<Customer, String>{

	Customer findByNic(String nic);
}
