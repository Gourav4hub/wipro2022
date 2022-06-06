package com.wipro.boot.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaryRecordModel
{
	private String month;	
	private Float amount;
	private Integer bonus;
	private Integer employeeId;
}
