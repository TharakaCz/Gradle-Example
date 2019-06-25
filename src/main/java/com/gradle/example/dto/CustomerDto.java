/**
 * Jun 25, 2019	
 * Gradle-Example
 * com.gradle.example.dto
 */
package com.gradle.example.dto;

/**
 * @author Tharaka Chandralal
 */
public class CustomerDto {

	private String customerId;
	private String name;
	private String nic;
	private String gender;
	private String mobileNumber;
	
	public CustomerDto() {
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
