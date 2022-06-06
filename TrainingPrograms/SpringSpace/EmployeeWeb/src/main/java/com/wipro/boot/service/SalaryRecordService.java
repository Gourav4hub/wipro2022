package com.wipro.boot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.boot.entity.Employee;
import com.wipro.boot.entity.SalaryRecord;
import com.wipro.boot.repository.AddressRepository;
import com.wipro.boot.repository.EmployeeRepository;
import com.wipro.boot.repository.SalaryRecordRepository;

@Service
public class SalaryRecordService 
{
	@Autowired
	private SalaryRecordRepository salaryRecordRepo;
	

	public boolean saveRecord(SalaryRecord record) 
	{
		try 
		{
			salaryRecordRepo.save(record);			
			return true;
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		return false;
	}

	public List<SalaryRecord> list() 
	{	
		return salaryRecordRepo.findAll();
	}
	
	public Optional<SalaryRecord> get(Integer id) 
	{
		return salaryRecordRepo.findById(id);		
	}

	public void deleteRecord(Integer id) 
	{
		salaryRecordRepo.deleteById(id);
	}	
}
