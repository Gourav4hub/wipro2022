package com.wipro.linkedlist.mainpk;

import com.wipro.linkedlist.model.StudentList;

public class MainClass {

	public static void main(String[] args) 
	{		
		StudentList list = new StudentList();
		
		list.addStudent();
		list.addStudent();
		list.addStudent();
		
		list.traverse();
	}
}
