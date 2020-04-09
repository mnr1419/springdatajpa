package com.example.springdatajpa.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.domain.EmployeeDetails;
@Repository

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {
	
	EmployeeDetails findByEmployeeId(@Param("empId") Integer empId);
	@Transactional
    @Modifying
    @Query("DELETE FROM EmployeeDetails WHERE empId =:empId")
	void deleteEmployeeById(@Param("empId")Integer empId);

}
