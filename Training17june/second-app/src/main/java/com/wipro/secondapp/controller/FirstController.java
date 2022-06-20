package com.wipro.secondapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController 
{
	@GetMapping("/")
	public @ResponseBody String home() {
		return "Welcome Home";
	}
}
