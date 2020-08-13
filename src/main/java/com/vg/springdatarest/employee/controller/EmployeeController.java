package com.vg.springdatarest.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vg.springdatarest.employee.entities.Employee;
import com.vg.springdatarest.employee.repo.EmployeeRepository;
import com.vg.springdatarest.employee.requestresponse.AddEmployeeRequest;
import com.vg.springdatarest.employee.requestresponse.EmployeeSecretResponse;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepo;

	EmployeeController(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@GetMapping(path = "/employees")
	public List<EmployeeSecretResponse> getEmployee() {
		List<EmployeeSecretResponse> employeeSecretResponses = new ArrayList<>();
		List<Employee> employees = employeeRepo.findAll();
		employees.forEach(emp -> {

			EmployeeSecretResponse employeeSecretResponse = new EmployeeSecretResponse();
			employeeSecretResponse.setId(emp.getId());
			employeeSecretResponse.setFirstName(emp.getFirstName());
			employeeSecretResponses.add(employeeSecretResponse);
		});

		return employeeSecretResponses;

	}

	@PostMapping("/saveEmployees")
	public Employee newEmployee(@RequestBody AddEmployeeRequest addEmployeeRequest) {
		Employee emp= new Employee();
		emp.setId(addEmployeeRequest.getId());
		emp.setFirstName(addEmployeeRequest.getFirstName());
		emp.setLastName(addEmployeeRequest.getLastName());
		return employeeRepo.save(emp);
	}

}
