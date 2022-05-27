package com.wipro.doublelist.mainpk;

import java.util.Scanner;

import com.wipro.doublelist.model.StudentList;

public class MainClass {

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		StudentList list = new StudentList();
		while(true)
		{
			System.out.println("\n1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. List Students");
			System.out.println("7. Exit ");
			System.out.print(">>> ");
			choice = sc.nextInt();
			if(choice==7)
				break;
			switch(choice) 
			{
				case 1 : list.addStudent(); break;
				case 2 : list.removeStudent(); break;
				case 3 : list.traverse(); break;
				default : System.out.println("\nWrong Choice !");
			}
		}
		System.out.println("*** Thanks *** ");
	}
}
