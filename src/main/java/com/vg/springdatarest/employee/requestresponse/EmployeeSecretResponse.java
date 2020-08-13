package com.vg.springdatarest.employee.requestresponse;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class EmployeeSecretResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1260107658795635727L;

	private long id;
	private String firstName;
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
	
	
	
}
