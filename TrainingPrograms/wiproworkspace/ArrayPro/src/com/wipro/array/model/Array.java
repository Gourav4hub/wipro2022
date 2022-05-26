package com.wipro.array.model;

import java.util.Arrays;

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
		return Arrays.copyOfRange(values, 0, indexValue+1);		
	}	
	public int getSize() {
		return size;
	}	
	
	// O(n)
	private void regenerateArray(boolean isIncrease,int newSize) 
	{
		if(isIncrease) 
		{
			this.size = newSize;
			int arr[] = new int[this.size];
			for(int i=0; i<=this.indexValue;i++) 
			{
				arr[i] = this.values[i];
			}
			this.values = arr;
		}
	}
	// O(N)
	public int linearSearch(int value) 
	{
		for(int i=0; i<=indexValue; i++) // 10,00,000 Values 
		{
			if(this.values[i]==value) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public int binarySearch(int value) 
	{
		int start = 0;
		int end = indexValue;
		int mid = (start+end)/2;
		
		while(start<=end) 
		{
			if(values[mid]==value)
				return mid;
			
			if(value > values[mid])
				start = mid+1;
			else
				end = mid-1;
			
			mid = (start+end)/2;
		}
		
		return -1;
	}
	
	// O(N2)
	public void selectionSort() 
	{
		for(int i=0; i<indexValue; i++) // indexValue = 5
		{
			for(int j=i+1; j<=indexValue; j++) 
			{
				if(values[j] < values[i])
				{
					int z = values[i];
					values[i] = values[j];
					values[j] = z;
				}
			}
		}
	}
	
	
	// Add New Element in Array
	// 
	public void add(int value) 
	{
		if(this.indexValue==this.size-1) 
		{
			regenerateArray(true,this.size+10);
		}
		this.indexValue++;
		this.values[this.indexValue] = value;
	}
	
	// Remove One Element in Array
	// O(1)
	public int remove() 
	{
		int value = this.values[this.indexValue];
		this.values[indexValue] = 0;
		this.indexValue--;
		return value;
	}	
	
	// O(N)
	public int remove(int index) 
	{
		if(index<0 || index>indexValue)
			return -1;
		
		int value = this.values[index];
		
		for(int i=index; i<=indexValue; i++) 
		{
			this.values[i] = this.values[i+1];
		}
		
		this.indexValue--;		
		return value;
	}	
}











