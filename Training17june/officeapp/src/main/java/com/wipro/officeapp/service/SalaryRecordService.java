package com.wipro.officeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.officeapp.entity.Employee;
import com.wipro.officeapp.entity.SalaryRecord;
import com.wipro.officeapp.repository.SalaryRecordRepository;

@Service
public class SalaryRecordService
{
	@Autowired
	private SalaryRecordRepository salaryRepo;

	public boolean saveRecord(SalaryRecord salaryRecord) 
	{
		try {
			salaryRepo.save(salaryRecord);
			salaryRepo.flush();
			return true;
	}catch(Exception ex) {
		System.err.println("Save Salary : " + ex.getMessage());
		return false;
	}
	}

	public List<SalaryRecord> list() {
		return salaryRepo.findAll();
	}
}
