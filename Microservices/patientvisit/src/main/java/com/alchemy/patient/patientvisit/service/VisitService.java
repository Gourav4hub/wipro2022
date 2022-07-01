package com.alchemy.patient.patientvisit.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.alchemy.patient.patientvisit.model.Patient;
import com.alchemy.patient.patientvisit.model.PatientVisit;
import com.alchemy.patient.patientvisit.repository.PatientVisitRepository;

@Service
public class VisitService 
{
	@Autowired
	private PatientVisitRepository patientVisitRepository;
	
	public boolean saveVisit(PatientVisit visit) 
	{
		try {
			visit.setVisitDate(new Date());			
			patientVisitRepository.save(visit);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	public List<PatientVisit> list(String patientId) 
	{
		return patientVisitRepository.findByPatientId(patientId);		
	}
}
