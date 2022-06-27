package com.wipro.officeapp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.officeapp2.entity.User;
import com.wipro.officeapp2.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	public boolean saveUser(User user) {
		try{
			userRepo.save(user);
			return true;
		}catch(Exception ex) {
			System.err.println("User Save Error : "+ex.getMessage());
			return false;
		}
	}
	
	public boolean isExistByName(String name) {
		return userRepo.findByUsername(name).isPresent();
	}
}