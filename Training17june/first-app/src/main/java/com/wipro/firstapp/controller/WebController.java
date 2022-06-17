package com.wipro.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@GetMapping("/")    // http://localhost:8080/
	public String home() 
	{
		return "Home Response";
	}
	
	@GetMapping("/about")    // http://localhost:8080/about
	public String about() 
	{
		return "About Response";
	}
	
	@GetMapping("/contact")    // http://localhost:8080/contact
	public String contact() 
	{
		return "Contact Response";
	}
}
