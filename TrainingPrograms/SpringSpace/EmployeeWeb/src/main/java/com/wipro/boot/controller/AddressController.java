package com.wipro.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.boot.entity.Address;
import com.wipro.boot.entity.Employee;
import com.wipro.boot.response.WebResponse;
import com.wipro.boot.service.AddressService;
import com.wipro.boot.service.EmployeeService;

@RestController
@RequestMapping("/address")
public class AddressController 
{
	@Autowired
	private AddressService addressService;		
	
	@RequestMapping(value = "/update",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WebResponse> updateAddress(@RequestBody Address address) 
	{			
		boolean status = addressService.updateAddress(address);
		WebResponse response = new WebResponse(status, address);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WebResponse> listAddress()
	{
		List<Address> list = addressService.list();
		WebResponse response = new WebResponse(true, list);
		return ResponseEntity.ok(response);
	} 
	
	@RequestMapping(value = "/get/{id}",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WebResponse> getAddress(@PathVariable(name = "id") Integer id)
	{
		WebResponse response = null;
		Optional<Address> optional = addressService.get(id);
		if(optional.isPresent())
			response = new WebResponse(true,optional.get());
		else
			response = new WebResponse(false,"Invalid Address Id !",null);		
		return ResponseEntity.ok(response);
	}	
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WebResponse> deleteAddress(@PathVariable(name = "id") Integer id)
	{
		WebResponse response = null;
		Optional<Address> optional = addressService.get(id);
		if(optional.isPresent())
		{
			addressService.deleteAddress(id);
			response = new WebResponse(true,"Record Deleted !",null);
		}
		else
			response = new WebResponse(false,"Invalid Address Id !",null);		
		return ResponseEntity.ok(response);
	}	
}
