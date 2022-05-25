package com.wipro.array.model;

public class Array 
{
	private int values[];
	private int size;
	private int indexValue;
	
	// Initialization block
	{
		this.indexValue = -1;
	}
	
	public Array() 
	{		
		this.size = 10;
		this.values = new int[this.size];
	}
	public Array(int size) 
	{		
		this.size = size;
		this.values = new int[this.size];
	}
	
	public int[] getValues() 
	{		
		return values;
	}	
	public int getSize() {
		return size;
	}
	
	// Add New Element in Array
	public void add(int value) 
	{
		this.indexValue++;
		this.values[this.indexValue] = value;
	}
	
}
