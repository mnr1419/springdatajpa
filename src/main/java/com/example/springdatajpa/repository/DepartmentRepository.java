package com.example.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.domain.DepartmentDetails;
import com.example.springdatajpa.domain.EmployeeDetails;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentDetails, Long> {
	

}
