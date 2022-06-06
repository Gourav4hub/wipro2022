package com.wipro.boot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.entity.Employee;
import com.wipro.boot.entity.SalaryRecord;
import com.wipro.boot.model.SalaryRecordModel;
import com.wipro.boot.response.WebResponse;
import com.wipro.boot.service.EmployeeService;
import com.wipro.boot.service.SalaryRecordService;

@RestController
@RequestMapping("/salaryrecord")
public class SalaryRecordController 
{
	@Autowired
	private SalaryRecordService salaryRecordService;
	@Autowired
	private EmployeeService empService;
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WebResponse> saveEmp(@RequestBody SalaryRecordModel recordModel) 
	{			
		Optional<Employee> opEmp = empService.get(recordModel.getEmployeeId());
		if(opEmp.isPresent()) 
		{
			Employee employee = opEmp.get();
			SalaryRecord salaryRecord = new SalaryRecord(recordModel,employee);
			boolean status = salaryRecordService.saveRecord(salaryRecord);
			WebResponse response = new WebResponse(status, recordModel);
			return ResponseEntity.ok(response);
		}else {
			WebResponse response = new WebResponse(false, "Invalid Employee Id",recordModel);
			return ResponseEntity.ok(response);	
		}
	}
}
