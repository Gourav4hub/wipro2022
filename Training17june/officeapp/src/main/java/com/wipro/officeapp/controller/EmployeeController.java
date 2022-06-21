package com.wipro.officeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.officeapp.entity.Employee;
import com.wipro.officeapp.repository.EmployeeRepository;
import com.wipro.officeapp.response.WebResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping(value = "/save")
	public ResponseEntity<WebResponse> saveEmployee(@RequestBody Employee employee) 
	{
		empRepo.save(employee);
		WebResponse res = new WebResponse(true, employee);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<WebResponse> listEmployee()
	{
		List<Employee> list =  empRepo.findAll();
		WebResponse res = new WebResponse(true, list);
		return ResponseEntity.ok(res);
	}
}










