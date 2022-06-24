package com.wipro.officeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
		.withUser("gourav").password("12345").roles("OFFICE_ADMIN")
		.and()
		.withUser("akshay").password("54321").roles("OFFICE_MANGER")
		.and()
		.withUser("meena").password("123").roles("OFFICE_HR");
	}
	
	@Bean
	PasswordEncoder encoder() 
	{
		return NoOpPasswordEncoder.getInstance();
	}
}
