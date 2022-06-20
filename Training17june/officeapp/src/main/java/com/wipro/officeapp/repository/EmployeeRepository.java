package com.wipro.officeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.officeapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>
{

}
