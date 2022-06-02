package com.wipro.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.entity.Employee;
import com.wipro.boot.response.WebResponse;
import com.wipro.boot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	// http://localhost:8081/employee/save
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ResponseEntity<WebResponse> saveEmp(@RequestBody Employee emp) 
	{
		boolean status = empService.saveEmployee(emp);
		WebResponse response = new WebResponse(status, emp);
		return new ResponseEntity<WebResponse>(HttpStatus.OK).ok(response);
	}
}
