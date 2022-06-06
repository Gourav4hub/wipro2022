package com.wipro.boot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.boot.entity.Employee;
import com.wipro.boot.repository.AddressRepository;
import com.wipro.boot.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepo;
	@Autowired
	private AddressRepository addressRepo;

	public boolean saveEmployee(Employee emp) 
	{
		try 
		{
			addressRepo.save(emp.getAddress());
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
