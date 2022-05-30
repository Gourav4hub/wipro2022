package com.wipro.sorting;

public class Pro2 {

	public static void main(String[] args) 
	{
		int arr[] = {2,5,7,3,9}; // 26
	
		int z = sum(arr,0);
		System.out.println(z);
	}
	
	private static int sum(int arr[],int index) 
	{
		if(index==arr.length-1)
			return arr[index];
				
		return arr[index] + sum(arr,index+1);
	}	
}
