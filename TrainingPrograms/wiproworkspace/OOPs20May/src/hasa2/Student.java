package hasa2;

import java.util.Scanner;

public class Student 
{
	// Data Members / Instance Variable
	private int rollNumber;
	private String studentName;
	private int age;
	private String city;
	private Exam exams[];
	
	public Student() {
		this.exams = new Exam[3];
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
		for(int i=0; i<this.exams.length; i++)
		{
			this.exams[i] = new Exam();
			this.exams[i].inputExam();
		}
	}
	public void show() 
	{
		System.out.println("\nRoll : " + this.rollNumber);
		System.out.println("Name : " + this.studentName);
		System.out.println("Age : " + this.age);
		System.out.println("City : " + this.city);
		for(Exam exam : this.exams)
		{
			if(exam==null)
			{
				System.out.println("No Exam Data Available !");
				break;
			}
			else
				exam.showExam();
		}
	}
}
