package com.wipro.doublelist.mainpk;

import java.util.Scanner;

import com.wipro.doublelist.model.Node;
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
			System.out.println("3. List Students (Forward)");
			System.out.println("4. List Students (Backward)");
			System.out.println("5. Delete Student"); // Roll :  
			System.out.println("6. Search Student"); // Roll : 
			System.out.println("7. Exit ");
			System.out.print(">>> ");
			choice = sc.nextInt();
			if(choice==7)
				break;
			switch(choice) 
			{
				case 1 : list.addStudent(); break;
				case 2 : list.removeStudent(); break;
				case 3 : list.traverse(true); break;
				case 4 : list.traverse(false); break;
				case 5 : System.out.println("Roll : ");				
				  		 list.deleteStudent(sc.nextInt());
				  		 break;
				case 6 :  System.out.println("Roll : ");				
						  Node node = list.searchStudent(sc.nextInt());
						  if(node==null)
							  	System.out.println("No Student Found !");
						  else
							  node.show();
						  break;
				default : System.out.println("\nWrong Choice !");
			}
		}
		System.out.println("*** Thanks *** ");
	}
}
