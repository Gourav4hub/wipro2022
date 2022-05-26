package com.wipro.array;

import java.util.ArrayList;

public class Pro1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Vikas");
		list.add("Meena");
		list.add("Gopal");
		list.add("Aakash");
		
		list.add(1, "Lokesh");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}
}
