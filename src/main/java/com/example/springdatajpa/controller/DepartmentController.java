package com.example.springdatajpa.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.domain.DepartmentDetails;
import com.example.springdatajpa.services.DepartmentService;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = {"http://localhost:3000"},allowedHeaders = "*",maxAge = 3600)
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@GetMapping
	public List<DepartmentDetails> getAllDeptDetails(){
		return service.findAll();
	}
	
	@PostMapping
	public String createDepartment(@RequestBody DepartmentDetails departmentDetails){
		DepartmentDetails details = service.saveDepartMent(departmentDetails);
		if(Objects.nonNull(details)){
			return "Department Successfully Added";
		}
		return null;
	}

}
