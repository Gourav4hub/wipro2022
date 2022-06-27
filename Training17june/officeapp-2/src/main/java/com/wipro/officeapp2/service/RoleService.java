package com.wipro.officeapp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.officeapp2.model.Role;
import com.wipro.officeapp2.model.User;
import com.wipro.officeapp2.repository.RoleRepository;
import com.wipro.officeapp2.repository.UserRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepo;
	
	public boolean saveRole(Role role) 
	{
		try{
			roleRepo.save(role);
			
			return true;
		}catch(Exception ex) {
			System.err.println("Role Save Error : "+ex.getMessage());
			return false;
		}
	}
}
