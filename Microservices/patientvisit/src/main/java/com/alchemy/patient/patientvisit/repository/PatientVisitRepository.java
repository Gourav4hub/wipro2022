package com.alchemy.patient.patientvisit.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alchemy.patient.patientvisit.model.Patient;
import com.alchemy.patient.patientvisit.model.PatientVisit;


@Repository
public interface PatientVisitRepository extends MongoRepository<PatientVisit, String>
{
	List<PatientVisit> findByPatientId(String patientId);
	
}
