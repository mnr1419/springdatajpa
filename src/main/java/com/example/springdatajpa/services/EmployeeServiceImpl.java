package com.example.springdatajpa.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.domain.EmployeeDetails;
import com.example.springdatajpa.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<EmployeeDetails> findAll() {
		System.out.println("FindAll method calling.......");
		 
		List<EmployeeDetails> details = employeeRepository.findAll();
		return details;
	}
	@Override
	public EmployeeDetails  findByEmployeeId(String empId) {
		// TODO Auto-generated method stub
		System.out.println("findByEmployeeId method calling.......");
		return employeeRepository.findByEmployeeId(Integer.parseInt(empId));
		
	}
	@Override
	public boolean saveEmployeeId(EmployeeDetails empdetails) {
		EmployeeDetails detail = (EmployeeDetails) employeeRepository.saveAndFlush(empdetails);
		if(Objects.nonNull(detail)){
			return true;
		}
		return false;
	}
	@Override
	public void deleteEmployeeById(String empId) {
		if(Objects.nonNull(empId)){
			employeeRepository.deleteEmployeeById(Integer.parseInt(empId));
		}
		
	}

}
