package com.wipro.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.wipro.boot.model.SalaryRecordModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee_salary")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "salaryId")
public class SalaryRecord 
{
	
	@Id
	@Column(name = "salary_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer salaryId;
	
	@Column(name = "month",nullable = false)
	private String month;
	
	@Column(name = "amount",nullable = false)
	private Float amount;
	
	@Column(name = "bonus",nullable = true)
	private Integer bonus;	
	
	@ManyToOne
	private Employee employee;
	
	public SalaryRecord(SalaryRecordModel recordModel, Employee employee) 
	{
		this.month = recordModel.getMonth();
		this.amount = recordModel.getAmount();
		this.bonus = recordModel.getBonus();
		this.employee = employee;
	}

}






