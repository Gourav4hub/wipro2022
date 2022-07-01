package com.alchemy.patient.patienttest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alchemy.patient.patienttest.model.PatientTest;


@Repository
public interface PatientTestRepository extends MongoRepository<PatientTest, String>
{
	List<PatientTest> findByVisitId(String visitId);
}
