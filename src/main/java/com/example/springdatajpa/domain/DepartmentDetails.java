package com.example.springdatajpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="dept_details")
@Getter @Setter @NoArgsConstructor
public class DepartmentDetails {
	
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="dept_name")
	private String deptName;
	
	/* @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "emp_id", nullable = false)
	private EmployeeDetails employeeDetails;*/

}
