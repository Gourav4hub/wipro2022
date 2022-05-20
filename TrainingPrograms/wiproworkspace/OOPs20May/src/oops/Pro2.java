package oops;

import java.util.Scanner;

public class Pro2 
{
	public static void main(String[] args) 
	{
		Student arr[] = new Student[5];
			
		arr[0] = new Student(101, "Vikas", 25, "Indore", 345.25f);
		arr[1] = new Student(102,"Meena","Ujjain");
		arr[2] = new Student(103,"Hitesh",20,"Bhopal",321.23f);
		arr[3] = new Student(104,"Lokesh",34,"Dewas",321.21f);
		arr[4] = new Student(105,"Pooja","Pune");
		
		int roll;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll : ");
		roll = sc.nextInt();
		
		boolean isFound = false;
		for(Student stud : arr) 
		{
			if(stud.getRollNumber()==roll) 
			{
				isFound = true;
				System.out.print("City : ");
				String city = sc.next();
				stud.setCity(city);				
				break;
			}
		}
		if(isFound==false) {
			System.out.println("Student Not Found !");
		}
		
		for(Student stud : arr) 
		{
			stud.show();
		}
	}
}
