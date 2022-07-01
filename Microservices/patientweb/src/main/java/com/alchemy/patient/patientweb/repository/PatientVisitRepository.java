package com.alchemy.patient.patientweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alchemy.patient.patientweb.model.Patient;
import com.alchemy.patient.patientweb.model.PatientVisit;

@Repository
public interface PatientVisitRepository extends MongoRepository<PatientVisit, String>{

}
