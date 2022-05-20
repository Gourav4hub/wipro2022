package oops;

import java.util.Scanner;

public class Student 
{
	// Data Members / Instance Variable
	private int rollNumber;
	private String studentName;
	private int age;
	private String city;
	private float marks;
	
	// Getter Method
	public int getRollNumber() 
	{
		return this.rollNumber;
	}	
	// Setter Method
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	// Default Constructor
	public Student() {}
	
	// Parameter Constructor
	public Student(Student ob) 
	{
		this.rollNumber = ob.rollNumber;
		this.studentName = ob.studentName;
		this.age = ob.age;
		this.city = ob.city;
		this.marks = ob.marks;				
	}
	
	public Student(int rollNumber, String studentName, 
			int age, String city,float marks) 
	{
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.age = age;
		this.city = city;
		this.marks = marks;				
	}
	
	public Student(int rollNumber, String studentName,String city) 
	{
		this.rollNumber = rollNumber;
		this.studentName = studentName;		
		this.city = city;		
	}
	
	
	// Member Methods
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll : ");
		rollNumber = sc.nextInt();
		System.out.print("Name : ");
		studentName = sc.next();
		System.out.print("Age : ");
		age = sc.nextInt();
		System.out.print("City : ");
		city = sc.next();
		System.out.print("Marks : ");
		marks = sc.nextFloat();
	}
	public void show() 
	{
		System.out.println("\nRoll : " + this.rollNumber);
		System.out.println("Name : " + this.studentName);
		System.out.println("Age : " + this.age);
		System.out.println("City : " + this.city);
		System.out.println("Marks : " + this.marks);
	}
}
