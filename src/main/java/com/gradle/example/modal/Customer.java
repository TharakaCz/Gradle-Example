/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.modal
 */
package com.gradle.example.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tharaka Chandralal
 */
@Entity
@Table(name="CUSTOMER")
public class Customer {

	private String customerId;
	private String name;
	private String nic;
	private String gender;
	private String mobileNumber;
	private String status;
	
	public Customer() {
		
	}

	@Id
	@Column(name="PID",nullable=false)
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Column(name="NAME",nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="NIC",nullable=false)
	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Column(name="GENDER",nullable=false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name="MOBILE_NUMBER",nullable=false)
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name="STATUS",nullable=false)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
