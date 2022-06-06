package com.wipro.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.boot.entity.SalaryRecord;

@Repository
public interface SalaryRecordRepository extends JpaRepository<SalaryRecord, Integer> 
{

}
