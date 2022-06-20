package com.wipro.secondapp.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.secondapp.model.User;

@RestController
@RequestMapping("/second")
public class SecondController 
{
	@GetMapping("/home")
	public String home() 
	{
		return "Second Home";
	}
	
	@GetMapping("/fun1")
	public String fun1(@RequestParam(value = "uname") String userName,
			@RequestParam(value = "age",required = false) Integer userAge) 
	{
		System.out.println(userName);
		System.out.println(userAge);
		return userName + " : " + userAge;
	}
	
	@GetMapping("/fun2/{uname}/{age}")
	public String fun2(@PathVariable(value = "uname") String userName,
			@PathVariable(value = "age") Integer userAge) 
	{
		System.out.println(userName);
		System.out.println(userAge);
		return userName + " : " + userAge;
	}
	
	
	@PostMapping("/fun3")
	public String fun3(@RequestParam(value = "uname") String userName,
			@RequestParam(value = "age",required = false) Integer userAge) 
	{
		System.out.println(userName);
		System.out.println(userAge);
		return userName + " : " + userAge;
	}
	
	
	@PostMapping("/fun4")
	public String fun4(@RequestBody Map<String, Object> data) 
	{
		String uname = (String) data.get("uname");
		int age = (int) data.get("age");
		return uname + " : " + age;
		
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
		return user;
	}
	
	
}
