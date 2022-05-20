package hasa;

import java.util.Scanner;

public class Student 
{
	// Data Members / Instance Variable
	private int rollNumber;
	private String studentName;
	private int age;
	private String city;
	private Exam exam;
	
	public Student() {
		
	}
	
	public Student(int rollNumber, String studentName, int age, String city, Exam exam) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.age = age;
		this.city = city;
		this.exam = exam;
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
		
		this.exam = new Exam();
		this.exam.inputExam();
	}
	public void show() 
	{
		System.out.println("\nRoll : " + this.rollNumber);
		System.out.println("Name : " + this.studentName);
		System.out.println("Age : " + this.age);
		System.out.println("City : " + this.city);
		if(this.exam==null)
			System.out.println("No Exam Data Available !");
		else
			this.exam.showExam();
	}
}
