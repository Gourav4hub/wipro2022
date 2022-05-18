package ifelse;

import java.util.Scanner;

public class Pro1 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voting Program !");
		System.out.print("Your Age : ");
		age = sc.nextInt();
		
		if(age>=18) // True Block
		{
			System.out.println("You Can Give Vote !");
		}
		else // False Block
		{
			System.out.println("You Can Not Give Vote !");
		}
		System.out.println("*** Thanks *** ");
	}
}
