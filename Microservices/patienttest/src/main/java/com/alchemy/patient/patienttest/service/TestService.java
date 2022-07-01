package com.alchemy.patient.patienttest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.alchemy.patient.patienttest.model.PatientTest;
import com.alchemy.patient.patienttest.repository.PatientTestRepository;


@Service
public class TestService 
{
	@Autowired
	private PatientTestRepository patientTestRepository;
	
	public boolean saveTest(PatientTest test) 
	{
		try {
			test.setTestDate(new Date());			
			patientTestRepository.save(test);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	public List<PatientTest> list(String visitId) 
	{
		return patientTestRepository.findByVisitId(visitId);
	}
}
