package com.wipro.array;

import com.wipro.array.model.Array;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Array ob = new Array();
				
		ob.add(65);
		ob.add(21);
		ob.add(33);
		ob.add(67);
		ob.add(32);
		ob.add(87);
		
		int i = ob.linearSearch(6);
		System.out.println(i);
		
//		for(int i : ob.getValues())
//			System.out.println(i);
	
	}
}
