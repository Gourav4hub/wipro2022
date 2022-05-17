import java.util.Scanner;

class Demo
{
	public static void main(String [] args)
	{
		// Arithmetical + - * / %
		float fnum,snum;
		float result; // Local Variable
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Number : ");
		fnum = sc.nextFloat(); 
	
		System.out.print("Second Number : ");
		snum = sc.nextFloat();
		
		result = fnum + snum;
		System.out.println(result);
		
		result = fnum - snum;
		System.out.println(result);
		
		result = fnum * snum;
		System.out.println(result);
		
		result = fnum / snum;
		System.out.println(result);
		
		result = fnum % snum;
		System.out.println(result);
	}
}
