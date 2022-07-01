package com.alchemy.patient.patienttest.response;

import java.util.List;

import com.alchemy.patient.patienttest.model.PatientTest;

public class TestResponse 
{
	List<PatientTest> testList;
	
	public TestResponse() {
		// TODO Auto-generated constructor stub
	}
	
	

	public TestResponse(List<PatientTest> testList) {
		super();
		this.testList = testList;
	}



	public List<PatientTest> getTestList() {
		return testList;
	}

	public void setTestList(List<PatientTest> testList) {
		this.testList = testList;
	}
	
}
