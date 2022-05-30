package com.wipro.sorting;

import com.wipro.sorting.model.Array;

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
		
		ob.insertionSort();
		
		for(int x : ob.getValues())
			System.out.println(x);
	}
}
