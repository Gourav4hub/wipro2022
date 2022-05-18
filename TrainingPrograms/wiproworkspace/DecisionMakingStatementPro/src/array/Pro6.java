package array;

import java.util.Scanner;

public class Pro6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Declaration
		int arr[][];		
		arr = new int[4][3]; // Size of array 4 : [3]
		
		System.out.println("Input Data : ");
		for(int i=0; i<arr.length; i++) // 4 
		{
			for(int j=0; j<arr[i].length;j++) // 3
			{
				System.out.print(">>> ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Output Data : ");
		for(int num[] : arr) 
		{
			for(int x : num) 
			{
				System.out.print(x + " ");
			}
			System.out.println("");
		}
		
	}
}
