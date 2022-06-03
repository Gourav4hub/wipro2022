package com.wipro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableAutoConfiguration 
@EnableSwagger2
public class EmployeeWebApplication  extends SpringBootServletInitializer 
{
	public static void main(String[] args) {
		SpringApplication.run(EmployeeWebApplication.class, args);
	}
}
