package model2;

import java.util.Scanner;

public class Person 
{
	private String name;
	private int age;
	private String phone;
	
	public Person(){
		
	}

	public Person(String name, int age, String phone) 
	{		
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nName : "); this.name = sc.next();
		System.out.print("Phone : "); this.phone = sc.next();
		System.out.print("Age : "); this.age = sc.nextInt();
	}
	
	public void show() 
	{
		System.out.println("\nName : " + this.name);
		System.out.println("Phone : " + this.phone);
		System.out.println("Age : " + this.age);
	}
}
