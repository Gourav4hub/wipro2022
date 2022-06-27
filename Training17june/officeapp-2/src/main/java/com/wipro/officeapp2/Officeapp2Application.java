package com.wipro.officeapp2;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.officeapp2.entity.Role;
import com.wipro.officeapp2.entity.User;
import com.wipro.officeapp2.service.RoleService;
import com.wipro.officeapp2.service.UserService;

@SpringBootApplication
public class Officeapp2Application implements CommandLineRunner
{
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	public static void main(String[] args) {
		SpringApplication.run(Officeapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		if(!userService.isExistByName("admin"))
		{
			Role rol1 = new Role();
			rol1.setName("ROLE_OFFICE_ADMIN");
			Role rol2 = new Role();
			rol2.setName("ROLE_OFFICE_MANAGER");
			Role rol3 = new Role();
			rol3.setName("ROLE_OFFICE_HR");
			
			Set<Role> roles = new HashSet<>();
			roles.add(rol1);
			
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setPassword("12345");
			user.setUsername("admin");
			user.setRoles(roles);
			
//			roleService.saveRole(rol1);
			roleService.saveRole(rol2);
			roleService.saveRole(rol3);
			userService.saveUser(user);
		}
	}
}
