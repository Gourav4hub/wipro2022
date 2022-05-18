package ifelse;

import java.util.Scanner;

public class Pro4 
{
	public static void main(String[] args) 
	{
		char grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Your Grade (A/B/C/D) : ");
		grade = sc.next().charAt(0);
		
		if(grade=='a' || grade=='A')
			System.out.println("Salary : 25000");
		else if(grade=='b' || grade=='B')
				System.out.println("Salary : 20000");
		else if(grade=='c' || grade=='C')
			System.out.println("Salary : 15000");
		else if(grade=='d' || grade=='D')
			System.out.println("Salary : 10000");
		else
			System.out.println("Wrong Grade !");
	}
}
