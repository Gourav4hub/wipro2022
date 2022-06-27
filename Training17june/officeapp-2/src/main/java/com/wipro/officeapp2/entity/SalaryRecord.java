package com.wipro.officeapp2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.wipro.officeapp2.model.SalaryRecordModel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "salary_record")
@Data
@NoArgsConstructor
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "recordId")
public class SalaryRecord 
{
	public SalaryRecord(SalaryRecordModel record, Employee emp) 
	{
		this.month = record.getMonth();
		this.amount = record.getAmount();
		this.bonus = record.getBonus();
		this.employee = emp;
	}

	@Id
	@Column(name = "record_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recordId;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "bonus")
	private Float bonus;
	
	@ManyToOne
	@JoinColumn(name = "employee")
	private Employee employee;
}
