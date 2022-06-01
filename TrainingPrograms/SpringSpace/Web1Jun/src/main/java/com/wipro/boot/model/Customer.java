package com.wipro.boot.model;

public class Customer 
{
	private String name;
	private Integer age;
	private float salary;
	
	public Customer() {	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
