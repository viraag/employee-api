package com.vg.springdatarest.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vg.springdatarest.employee.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}
