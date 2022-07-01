package com.alchemy.patient.patientvisit.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class PatientTest 
{
	@Id
	private String testId;
	private String visitId;
	private Date testDate;
	private String type;
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
