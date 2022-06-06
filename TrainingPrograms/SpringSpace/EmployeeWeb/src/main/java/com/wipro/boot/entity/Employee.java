package com.wipro.boot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "empId")
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
	
	@OneToMany(mappedBy = "employee")
	private List<SalaryRecord> salaryRecords;
}
