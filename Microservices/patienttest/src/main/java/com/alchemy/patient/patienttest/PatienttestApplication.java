package com.alchemy.patient.patienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PatienttestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatienttestApplication.class, args);
	}

}
