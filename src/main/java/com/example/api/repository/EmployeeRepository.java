package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	
	
}
