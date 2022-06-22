package com.wipro.officeapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.officeapp.entity.Employee;
import com.wipro.officeapp.entity.SalaryRecord;
import com.wipro.officeapp.model.SalaryRecordModel;
import com.wipro.officeapp.response.WebResponse;
import com.wipro.officeapp.service.EmployeeService;
import com.wipro.officeapp.service.SalaryRecordService;

@RestController
@RequestMapping("/empsalary")
public class SalaryRecordController {

	@Autowired
	private SalaryRecordService salaryService;
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public ResponseEntity<WebResponse> save(@RequestBody SalaryRecordModel record)
	{
		Optional<Employee> op = empService.get(record.getEmployeeId());
		if(op.isEmpty())
		{
			return ResponseEntity.badRequest().body(new WebResponse(false, "Invalid Employee !"));
		}else {
			Employee emp = op.get();
			SalaryRecord salaryRecord = new SalaryRecord(record,emp);
			boolean status = salaryService.saveRecord(salaryRecord);
			return ResponseEntity.badRequest().body(new WebResponse(status, salaryRecord));
		}
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<WebResponse> list()
	{
		List<SalaryRecord> list =  salaryService.list();
		WebResponse res = new WebResponse(true, list);
		return ResponseEntity.ok(res);
	}
}
