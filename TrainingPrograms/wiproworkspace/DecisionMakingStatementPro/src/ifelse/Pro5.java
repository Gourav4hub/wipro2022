package ifelse;

import java.util.Date;
import java.util.Scanner;

public class Pro5 
{
	public static void main(String[] args) 
	{		
		char grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Your Grade (A/B/C/D) : ");
		grade = sc.next().charAt(0);

		switch(grade) 
		{
			case 'a':
			case 'A': System.out.println("Salary : 25000");
					  break;					  
			case 'b':
			case 'B': System.out.println("Salary : 20000");
					  break;
			case 'c':
			case 'C': System.out.println("Salary : 15000");
					  break;					  
			case 'd':
			case 'D': System.out.println("Salary : 10000");
					  break;					  
			default:
					System.out.println("Wrong Grade !");				
		}
			
					
	}
}
