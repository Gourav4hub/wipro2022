package com.wipro.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.boot.entity.Employee;
import com.wipro.boot.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepo;

	public boolean saveEmployee(Employee emp) 
	{
		try 
		{
			employeeRepo.save(emp);			
			return true;
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		return false;
	}

	public List<Employee> list() 
	{	
		return employeeRepo.findAll();
	}

	public Optional<Employee> get(Integer empid) 
	{
		return employeeRepo.findById(empid);		
	}

	public void deleteEmp(Integer empid) 
	{
		employeeRepo.deleteById(empid);
	}	
}
