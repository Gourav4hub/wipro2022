package hasa;

import java.util.Scanner;

public class Exam 
{
	private String title;
	private float marks[];
	
	public Exam() {
		this.marks = new float[5];
	}
	
	public Exam(String title, float[] marks) 
	{		
		this.title = title;
		this.marks = marks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	
	public void inputExam() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Exam Title : ");
		this.title = sc.next();
		
		System.out.print("Enter 5 Subject Marks : ");
		for(int i=0; i<this.marks.length;i++) 
		{
			this.marks[i] = sc.nextFloat();
		}
	}
	
	public void showExam() 
	{
		System.out.println("\nExam Title : " + this.title);
		System.out.println("Marks : ");
		for(float num : this.marks) 
		{
			System.out.print(num + " ");
		}
	}
}
