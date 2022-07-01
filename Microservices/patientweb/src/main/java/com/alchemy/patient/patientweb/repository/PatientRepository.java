package com.alchemy.patient.patientweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alchemy.patient.patientweb.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String>{

}
