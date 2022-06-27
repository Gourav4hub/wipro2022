package com.wipro.officeapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@GetMapping("/")
	public String home() {
		return "Welcome Office App";
	}
}
