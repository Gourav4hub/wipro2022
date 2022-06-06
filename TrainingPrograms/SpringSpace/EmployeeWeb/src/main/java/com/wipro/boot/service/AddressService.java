package com.wipro.boot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.boot.entity.Address;
import com.wipro.boot.entity.Employee;
import com.wipro.boot.repository.AddressRepository;

@Service
public class AddressService 
{
	@Autowired
	private AddressRepository addressRepo;

	public List<Address> list() 
	{	
		return addressRepo.findAll();
	}

	public Optional<Address> get(Integer id) 
	{
		return addressRepo.findById(id);		
	}

	public void deleteAddress(Integer id) 
	{
		addressRepo.deleteById(id);
	}

	public boolean updateAddress(Address address) 
	{
		addressRepo.save(address);
		return false;
	}	
}
