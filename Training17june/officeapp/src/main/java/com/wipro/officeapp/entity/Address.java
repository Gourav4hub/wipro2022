package com.wipro.officeapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp_address")
@Data
public class Address 
{
	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name = "street",nullable = false)
	private String street;
	
	@Column(name = "city",nullable = false)
	private String city;
	
	@Column(name = "pincode",nullable = false)
	private String pincode;
}
