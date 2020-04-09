package com.example.springdatajpa.services;

import java.util.List;
import java.util.Optional;

import com.example.springdatajpa.domain.EmployeeDetails;

public interface EmployeeService {

	public List<EmployeeDetails> findAll();
	public EmployeeDetails  findByEmployeeId(String empId);
	public boolean saveEmployeeId(EmployeeDetails empdetails);
	public void deleteEmployeeById(String empId);
}
