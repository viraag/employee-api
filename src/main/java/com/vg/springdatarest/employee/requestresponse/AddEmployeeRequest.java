package com.vg.springdatarest.employee.requestresponse;

import org.springframework.stereotype.Component;

@Component
public class AddEmployeeRequest {

	private long id;
	private String firstName;
	private String lastName;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
