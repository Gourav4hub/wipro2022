package com.wipro.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@RequestMapping(value = "/test")
	public String fun1() 
	{
		return "Good Morning !";
	}
}
