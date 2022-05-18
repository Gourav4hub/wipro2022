package ifelse;

import java.util.Scanner;

public class Pro2 
{
	public static void main(String[] args) 
	{
		int age;
		char indian;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voting Program !");
		
		System.out.print("Are You Indian(Y/N) : ");
		indian = sc.next().charAt(0);
		
		if(indian=='y' || indian=='Y')
		{
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
		}else {
			System.out.println("Not Allowed, Go Your Country !");
		}
		System.out.println("*** Thanks *** ");
	}
}
