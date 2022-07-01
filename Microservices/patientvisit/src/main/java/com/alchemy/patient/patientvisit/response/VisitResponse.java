package com.alchemy.patient.patientvisit.response;

import java.util.List;

import com.alchemy.patient.patientvisit.model.PatientVisit;

public class VisitResponse 
{
	List<PatientVisit> visitList;
	
	
	
	public VisitResponse(List<PatientVisit> visitList) {
		super();
		this.visitList = visitList;
	}
	public void setVisitList(List<PatientVisit> visitList) {
		this.visitList = visitList;
	}
	public List<PatientVisit> getVisitList() {
		return visitList;
	}
}
