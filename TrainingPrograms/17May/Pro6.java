import java.util.Scanner;
class Demo
{
	public static void main(String [] args)
	{
		int sub1,sub2,sub3,sub4,sub5;
		int total;
		float percentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("OOPS : ");
		sub1 = sc.nextInt();
		System.out.print("Compiler : ");
		sub2 = sc.nextInt();
		System.out.print("Java : ");
		sub3 = sc.nextInt();
		System.out.print("DBMS : ");
		sub4 = sc.nextInt();
		System.out.print("C : ");
		sub5 = sc.nextInt();
		
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		// Type Casting
		percentage = (float)total/5; // Up Casting
		
		System.out.println("\nTotal Marks : " + total);
		System.out.println("Percentage : " + percentage);
	}
}
