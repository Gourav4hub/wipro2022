package com.wipro.officeapp2.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
	
	}
	
//	@Bean
//	PasswordEncoder encoder() 
//	{
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.cors().disable();
		http.csrf().disable();
		
		http.authorizeRequests()
		.antMatchers("/office/**").permitAll()
		.antMatchers("/employee/**").hasRole("OFFICE_ADMIN")
		.antMatchers("/address/**").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER")
		.antMatchers("/empsalary/**").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER","OFFICE_HR")
		.and()
		.exceptionHandling().accessDeniedPage("/office/accessDenied");
		
		super.configure(http);
	}
}
