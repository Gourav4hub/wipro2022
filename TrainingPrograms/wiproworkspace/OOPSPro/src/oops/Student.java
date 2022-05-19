package oops;

public class Student 
{
	// Data Members / Instance Variable
	private int rollNumber;
	private String studentName;
	private int age;
	private String city;
	private float marks;
	
	// Member Methods
	public void show() 
	{
		System.out.println("\nRoll : " + rollNumber);
		System.out.println("Name : " + studentName);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
		System.out.println("Marks : " + marks);
	}
}
