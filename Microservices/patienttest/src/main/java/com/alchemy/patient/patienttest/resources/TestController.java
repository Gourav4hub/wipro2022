package com.alchemy.patient.patienttest.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alchemy.patient.patienttest.model.PatientTest;
import com.alchemy.patient.patienttest.response.TestResponse;
import com.alchemy.patient.patienttest.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController 
{
	@Autowired
	private TestService testService;
	
	@PostMapping("/save")
	public ResponseEntity saveTest(@RequestBody PatientTest test) 
	{			
		testService.saveTest(test);
		return ResponseEntity.ok(test);
	}
	
	@PostMapping("/visitTest/{visitId}")
	public TestResponse list(@PathVariable String visitId)
	{
		List<PatientTest> testList = testService.list(visitId);
		return new TestResponse(testList);
	}
}
