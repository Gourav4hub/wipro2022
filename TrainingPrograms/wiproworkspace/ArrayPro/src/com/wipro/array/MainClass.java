package com.wipro.array;

import com.wipro.array.model.Array;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Array ob = new Array();
		
		ob.add(45);
		ob.add(33);
		
		for(int x : ob.getValues()) 
		{
			System.out.println(x);
		}
	}
}
