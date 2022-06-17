package com.wipro.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@GetMapping("/list") // http://localhost:8080/student/list
	public String list() 
	{
		return "Student List";
	}
	
	// http://localhost:8080/student/get?name=vikas&age=23
	@GetMapping("/get")
	public String get(@RequestParam(value = "name") String studentName,
			@RequestParam(value = "age") int studentAge) 
	{
		String str = studentName + " : " + studentAge;
		return str;
	}
	
	@GetMapping("/feescalculate")
	public String calculate(@RequestParam(value = "college") float collegeFees,
			@RequestParam(value = "transport") float transport,
			@RequestParam(value = "canteen") float canteen) 
	{
		float total = collegeFees + transport + canteen;
		return "Fees : "+total;
	}
	
	
	
	
	
}
