package com.example.springdatajpa.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.domain.DepartmentDetails;
import com.example.springdatajpa.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDetails> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public DepartmentDetails findByDeptId(String deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentDetails saveDepartMent(DepartmentDetails deptDetails) {
	return departmentRepository.saveAndFlush(deptDetails);
		
	}

	@Override
	public void deleteDeptById(String deptId) {
		// TODO Auto-generated method stub
		
	}

}
