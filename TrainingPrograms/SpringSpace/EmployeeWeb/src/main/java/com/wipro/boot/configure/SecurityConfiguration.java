package com.wipro.boot.configure;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource ds;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
//		auth.inMemoryAuthentication()
//			.withUser("admin").password("12345").roles("OFFICE_ADMIN")
//			.and()
//			.withUser("manager").password("54321").roles("OFFICE_MANAGER");
		
		auth.jdbcAuthentication().dataSource(ds)
		.withUser("admin").password("12345").roles("OFFICE_ADMIN")
		.and()
		.withUser("manager").password("54321").roles("OFFICE_MANAGER");
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() 
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{		
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/login").permitAll()
		.antMatchers("/salaryrecord/**").hasRole("OFFICE_ADMIN")
		.antMatchers("/employee/**").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER")
		.antMatchers("/address/**").hasAnyRole("OFFICE_ADMIN","OFFICE_MANAGER")		
		.and()
		.exceptionHandling().accessDeniedPage("/accessDenied")
		.and().httpBasic();
		
		super.configure(http);
	}
}
