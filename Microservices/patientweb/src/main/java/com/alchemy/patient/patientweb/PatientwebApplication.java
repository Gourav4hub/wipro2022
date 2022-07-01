package com.alchemy.patient.patientweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient // optional
public class PatientwebApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() 
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(PatientwebApplication.class, args);
	}

}
