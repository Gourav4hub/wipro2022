package com.wipro.cloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController 
{
	@Value("${wipro.title}")
	private String title;
	
	@Value("${wipro.session.start-date}")
	private String startDate;
	
	@Value("${wipro.session.end-date}")
	private String endDate;
	
	@GetMapping("/")
	public String home() {
		return title + ":" + startDate + ":" + endDate;
	}
}
