package com.wipro.officeapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp_info")
@Data
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private String empId;
	
	@Column(name = "emp_name",nullable = false)
	private String empName;
	
	@Column(name = "emp_salary" , nullable = false)
	private Float salary;
	
	@Column(name = "emp_city", nullable = true)
	private String city;
	
	@Column(name = "emp_phone",nullable = true,unique = true)
	private String phone;	
}








