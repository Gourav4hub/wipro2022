package model1;

import java.util.Scanner;

public class Student extends Person 
{
	private int roll;
	private float marks;
	
	public Student() {	
		System.out.println("Student Object is created !");
	}

	public Student(int roll, float marks) 
	{		
		this.roll = roll;
		this.marks = marks;
	}
	
	public void inputStudent() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll : "); this.roll = sc.nextInt();
		System.out.print("Marks : "); this.marks = sc.nextFloat();
	}	
	
	public void showStudent() 
	{
		System.out.println("Roll : " + this.roll);
		System.out.println("Marks : " + this.marks);
	}
	
}
