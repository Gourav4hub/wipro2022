package com.wipro.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee_info")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "emp_name" , nullable = false)
	private String empName;
	
	@Column(name = "emp_mail" , nullable = false , unique = true)
	private String empEmail;
	
	@Column(name = "emp_salary", nullable = true)
	private Float empSalary;
		
	@OneToOne
	@JoinColumn(name = "emp_address")
	private Address address;	
}
