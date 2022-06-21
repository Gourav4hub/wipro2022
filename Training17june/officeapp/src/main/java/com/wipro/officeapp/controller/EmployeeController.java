package com.wipro.officeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.officeapp.entity.Employee;
import com.wipro.officeapp.repository.EmployeeRepository;
import com.wipro.officeapp.response.WebResponse;
import com.wipro.officeapp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<WebResponse> saveEmployee(@RequestBody Employee employee) 
	{
		boolean status = empService.saveEmployee(employee);
		WebResponse res = new WebResponse(status, employee);
		return ResponseEntity.ok(res);
	}
	
	@PutMapping (value = "/update")
	public ResponseEntity<WebResponse> updateEmployee(@RequestBody Employee employee) 
	{
		boolean status = empService.saveEmployee(employee);
		WebResponse res = new WebResponse(status, employee);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<WebResponse> listEmployee()
	{
		List<Employee> list =  empService.list();
		WebResponse res = new WebResponse(true, list);
		return ResponseEntity.ok(res);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<WebResponse> deleteEmployee(@PathVariable(value = "id") String eid)
	{
		boolean status = empService.deleteEmployee(eid);
		WebResponse res = new WebResponse(status, eid);
		return ResponseEntity.ok(res);
	}
	
	
	
	
	
	
	
}










