package com.wipro.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ResponseEntity<WebResponse> saveEmp(@RequestBody Employee emp) 
	{			
		boolean status = empService.saveEmployee(emp);
		WebResponse response = new WebResponse(status, emp);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ResponseEntity<WebResponse> updateEmp(@RequestBody Employee emp) 
	{			
		boolean status = empService.saveEmployee(emp);
		WebResponse response = new WebResponse(status, emp);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ResponseEntity<WebResponse> listEmp()
	{
		List<Employee> list = empService.list();
		WebResponse response = new WebResponse(true, list);
		return ResponseEntity.ok(response);
	} 
	
	@RequestMapping(value = "/get/{id}",method = RequestMethod.POST)
	public ResponseEntity<WebResponse> getEmp(@PathVariable(name = "id") Integer empid)
	{
		WebResponse response = null;
		Optional<Employee> optional = empService.get(empid);
		if(optional.isPresent())
			response = new WebResponse(true,optional.get());
		else
			response = new WebResponse(false,"Invalid Employee Id !",null);		
		return ResponseEntity.ok(response);
	}	
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
	public ResponseEntity<WebResponse> deleteEmp(@PathVariable(name = "id") Integer empid)
	{
		WebResponse response = null;
		Optional<Employee> optional = empService.get(empid);
		if(optional.isPresent())
		{
			empService.deleteEmp(empid);
			response = new WebResponse(true,"Record Deleted !",null);
		}
		else
			response = new WebResponse(false,"Invalid Employee Id !",null);		
		return ResponseEntity.ok(response);
	}	
}
