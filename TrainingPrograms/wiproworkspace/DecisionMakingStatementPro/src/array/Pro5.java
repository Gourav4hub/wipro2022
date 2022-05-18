package array;

import java.util.Scanner;

public class Pro5 
{
	public static void main(String[] args) 
	{
		int size;
		
		String friends[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Many Friends  : ");
		size = sc.nextInt();
		
		friends = new String[size];
		
		System.out.println("Add Data : ");
		for(int i=0; i<friends.length; i++) 
		{
			friends[i] = sc.next();
		}
		
		// For Each Loop : Traversing
		for(String str : friends)  // for(var str of friends)
		{
			System.out.println(str);
		}		
	}
}
