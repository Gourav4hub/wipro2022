package com.wipro.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@RequestMapping(value = "/test1")
	public String fun1() 
	{
		return "Good Morning Everyone !";
	}	
	
	// localhost:8081/test2?name=lokesh
	// localhost:8081/test2?name=Vikas&age=45
	@RequestMapping(value = "/test2") // Receive a String name
	public String fun2(@RequestParam(value = "name") String userName,
				@RequestParam(value = "age") int age) 
	{
		return "Hello " + userName + " : " + age;
	}
	
	@RequestMapping(value = "/test3") 
	public String fun3(@RequestParam(value = "name") String userName,
				@RequestParam(value = "age",required = false, defaultValue = "0") int age) 
	{
		return "Hello " + userName + " : " + age;
	}
	
	@RequestMapping(value = "/test4") 
	public String fun4(@RequestParam(value = "name") String userName,
				@RequestParam(value = "age",required = false) Integer age) 
	{
		if(age==null)
			return "Hello " + userName;
		else
			return "Hello " + userName + " : " + age;		
	}
}
