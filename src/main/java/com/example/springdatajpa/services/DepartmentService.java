package com.example.springdatajpa.services;

import java.util.List;

import com.example.springdatajpa.domain.DepartmentDetails;

public interface DepartmentService {
	public List<DepartmentDetails> findAll();
	public DepartmentDetails  findByDeptId(String deptId);
	public DepartmentDetails saveDepartMent(DepartmentDetails deptDetails);
	public void deleteDeptById(String deptId);

}
