package com.alchemy.patient.patientvisit.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class PatientVisit 
{
	@Id
	private String visitId;
	private String patientId;
	private Date visitDate;
	private String type; // testing,consultancy
	private List<PatientTest> testList;
	
	public PatientVisit() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTestList(List<PatientTest> testList) {
		this.testList = testList;
	}
	public List<PatientTest> getTestList() {
		return testList;
	}
	
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	public String getPatientId() {
		return patientId;
	}

	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PatientVisit [visitId=" + visitId + ", visitDate=" + visitDate + ", type=" + type + "]";
	}
	
	
}
