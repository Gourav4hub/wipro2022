package com.wipro.boot.controller;


import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
// ************************************************ GET ****************************************************	
	
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
// ************************************************* Path Variable *******************************************
	
	// localhost:8081/test5/vikas/23
	@RequestMapping(value = "/test5/{name}/{age}") 
	public String fun5(@PathVariable(value = "name") String userName,
			@PathVariable(value = "age") Integer age) 
	{
		return "Hello " + userName + " : " + age;
	}
	
// ****************************************************	POST Variable ****************************************
	
	@RequestMapping(value = "/test6",method = RequestMethod.POST) 
	public String fun6(@RequestParam(value = "name") String userName,
				@RequestParam(value = "age",required = false, defaultValue = "0") int age) 
	{
		return "Hello " + userName + " : " + age;
	}
	
	@RequestMapping(value = "/test7",method = RequestMethod.POST) 
	public String fun7(@RequestBody Map<String, Object> data) 
	{
		return "Hello " + data.get("name") + " : " + data.get("age");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
