package com.wipro.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@RequestMapping(value = "/test")
	public String fun1() 
	{
		return "My First Spring Response !";
	}
	
	@RequestMapping(value = "/demo")
	public String fun2() 
	{
		return "Wipro Training !";
	}
	
	@RequestMapping(value = "/sample")
	public String fun3() 
	{
		return "Good Morning !";
	}
}
