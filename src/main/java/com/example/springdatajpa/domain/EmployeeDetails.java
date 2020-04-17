package com.example.springdatajpa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="employee_details")
@Getter @Setter @NoArgsConstructor

@NamedQuery(name = "EmployeeDetails.findByEmployeeId",
        query = "SELECT e FROM EmployeeDetails e WHERE e.empId =:empId ")
public class EmployeeDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_salary")
	private int salary;
	
	/*@Column(name="emp_address")
	private String empAddress;
	
	@OneToOne(mappedBy = "employeeDetails", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
	private DepartmentDetails departmentDetails;*/

}
