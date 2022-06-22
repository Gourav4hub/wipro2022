package com.wipro.officeapp.model;

import lombok.Data;

@Data
public class SalaryRecordModel 
{
	private String employeeId;
	private String month;	
	private Float amount;	
	private Float bonus;	
}
