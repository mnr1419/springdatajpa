package com.example.springdatajpa.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.domain.EmployeeDetails;
import com.example.springdatajpa.errorreponse.SuccessResponse;
import com.example.springdatajpa.services.EmployeeService;
import com.example.springdatajpa.services.exception.EmployeeNotFoundException;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"},allowedHeaders = "*",maxAge = 3600)
public class EmployeeController {
	
	@Autowired
	private EmployeeService  employeeService;
	
	@GetMapping(value="/employee")
	public ResponseEntity<List<EmployeeDetails>> getAllEmployee() 
	 {
		 
		List<EmployeeDetails> details = employeeService.findAll();
		 return new ResponseEntity<>(details, HttpStatus.OK);
	}
	@GetMapping(value="/employee/{empId}")
	public EmployeeDetails findEmployee(@PathVariable("empId")String empId) throws EmployeeNotFoundException{
		
		EmployeeDetails  details = employeeService.findByEmployeeId(empId);
		if(Objects.isNull(details)){
			throw new EmployeeNotFoundException("No Records are found for  employeeId   " +empId);
		}
		return details;
		
	}
	
	@CrossOrigin(origins = {"http://localhost:3000"}, allowedHeaders = "*")
	@PostMapping("/employee")
	public SuccessResponse saveEmployee(@RequestBody EmployeeDetails empdetails){
		SuccessResponse response ;
		
		 Boolean flag = employeeService.saveEmployeeId(empdetails);
		 if(flag){
			 response = new SuccessResponse();
			 response.setSuccessCode("200");
			 response.setSuccessMessage("Success");
			 return response;
		 }
		 return null;
		 
	}
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployeeById(@PathVariable("empId") String empId){
		employeeService.deleteEmployeeById(empId);
	}
	@PutMapping("/employee")
	public SuccessResponse updateEmployee(@RequestBody EmployeeDetails empdetails){
		SuccessResponse response ;
		
		 Boolean flag = employeeService.saveEmployeeId(empdetails);
		 if(flag){
			 response = new SuccessResponse();
			 response.setSuccessCode("200");
			 response.setSuccessMessage("Success");
			 return response;
		 }
		 return null;
		 
	}

}
