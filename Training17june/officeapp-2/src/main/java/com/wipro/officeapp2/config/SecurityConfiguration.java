package com.wipro.officeapp2.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.wipro.officeapp2.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserService userService;
	@Autowired
	private UnauthorizedEntryPoint unauthorizedEntryPoint;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.userDetailsService(userService).passwordEncoder(encoder());
	}
	
	@Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/admin/**");
		super.configure(web);
	}
	
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
		
		http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
	}
	
	  @Override
	    @Bean
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }
	//
	    @Bean
	    public JwtAuthenticationFilter authenticationTokenFilterBean() throws Exception {
	        return new JwtAuthenticationFilter();
	    }
}
