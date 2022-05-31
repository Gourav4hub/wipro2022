package com.wipro.sorting;

public class QuickSort 
{
	private static int arr[] = {45,25,14,45,24,95,87,84,22,91};
	private static int SIZE = 10;
	
	public static void main(String[] args) 
	{		
		for(int x : arr)
			System.out.print(x + " ");
		
		qsort(0, 9);
		
		System.out.println("\n");
		
		for(int x : arr)
			System.out.print(x + " ");
		
		System.out.println("\n\nThanks");
	}
	
	private static int partition(int min,int max,int pivot) // 0 9 45
	{       
	      int minPoint = min; // 0
	      int maxPoint = max + 1; // 10     
	      do
	      {
	          do
		      {
	      	        minPoint++; // 3
		      }while(arr[minPoint] < pivot && minPoint<SIZE-1);
		   
		      do
		      {
		            maxPoint--; // 8
	          }while(arr[maxPoint]>pivot && maxPoint>=min);
	                  
	          if(minPoint < maxPoint)
		      {
		            swap(minPoint,maxPoint);
		      }else{
		            swap(min,maxPoint);
		      }
	      }while(minPoint < maxPoint);
	      return maxPoint;
	}

	private static void qsort(int min,int max) // min=0 max=9 
	{
	      int pivot;     
	      int p;
	      if(max>min)
	      {  
	            pivot = arr[min]; // 45
	            p = partition(min,max,pivot); // 0 9 45
	          
	            qsort(min,p-1); // 0 , 3
	            qsort(p+1,max); // 4 , 9
	      }else{
	            return;
	      }
	}


	private static void swap(int pos1,int pos2)
	{
	      int z = arr[pos1];
	      arr[pos1] = arr[pos2];
	      arr[pos2] = z;
	}
}
