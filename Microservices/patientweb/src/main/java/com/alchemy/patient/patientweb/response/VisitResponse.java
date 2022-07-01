package com.alchemy.patient.patientweb.response;

import java.util.List;

import com.alchemy.patient.patientweb.model.PatientVisit;

public class VisitResponse 
{
	List<PatientVisit> visitList;
	public VisitResponse() {
		// TODO Auto-generated constructor stub
	}
	
	
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
