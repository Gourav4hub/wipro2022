package com.wipro.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.response.WebResponse;

@RestController
public class WebController 
{
	@GetMapping("/")
	public String home() {
		return "Welcome .....";
	}
	
	@RequestMapping(value = "/accessDenied",method = {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<WebResponse> accessDenied() {
		WebResponse response = new WebResponse(false, null,"Unauthorized Access !");
		return ResponseEntity.badRequest().body(response);
	}
	
}
