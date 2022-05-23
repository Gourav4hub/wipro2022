package model2;

import java.util.Scanner;

public class Student extends Person 
{
	private int roll;
	private float marks;
	
	public Student() {	
		
	}

	public Student(int roll, float marks) 
	{		
		this.roll = roll;
		this.marks = marks;
	}
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Roll : "); this.roll = sc.nextInt();
		System.out.print("Marks : "); this.marks = sc.nextFloat();
	}	
	
	public void show() 
	{
		super.show();
		System.out.println("Roll : " + this.roll);
		System.out.println("Marks : " + this.marks);
	}
	
}
