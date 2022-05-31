package com.wipro.sorting;
import java.util.Scanner; 

public class Factorial 
{ 
	public static long factorial(int num) 
	{ 
		if(num==0)
				return 1;
		 
		return (num*factorial(num-1));		 
	} 
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the Factorial Number : "); 
		int a = sc.nextInt(); 
		long result=factorial(a); 
		System.out.println("Factorial of "+a+" "+"is "+result); sc.close(); 
	} 
} 