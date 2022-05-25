package com.wipro.array;

import com.wipro.array.model.Array;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Array ob = new Array();
		
		ob.add(45); 
		ob.add(33); 
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(45); 
		ob.add(33); 
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		ob.add(65);
		
		for(int i : ob.getValues())
			System.out.println(i);
	
	}
}
