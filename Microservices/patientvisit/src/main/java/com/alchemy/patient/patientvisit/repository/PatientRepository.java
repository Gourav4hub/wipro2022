package com.alchemy.patient.patientvisit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alchemy.patient.patientvisit.model.Patient;



@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{

}
