package com.employee.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.management.model.Employee;

// interface extending crud repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
