package com.wipro.sorting;

public class Pro1 
{
	public static void main(String[] args) 
	{
		// Recursion
		print(10);
	}
	
	private static void print(int num) 
	{
		if(num==0)
			return;
		System.out.println(num);
		print(num-1);
	}
}
