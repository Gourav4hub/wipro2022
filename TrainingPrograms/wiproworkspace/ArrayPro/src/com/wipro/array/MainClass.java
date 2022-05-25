package com.wipro.array;

import com.wipro.array.model.Array;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Array ob = new Array();
		
		ob.add(45); // 0
		ob.add(33); // 1
		ob.add(65);
		
		for(int x : ob.getValues()) 
		{
			System.out.println(x);
		}
		
		System.out.println("********************");
		
		//int y = ob.remove();
		int y = ob.remove(0);
		System.out.println("Del Value : " + y);
		
		for(int x : ob.getValues()) 
		{
			System.out.println(x);
		}
	}
}
