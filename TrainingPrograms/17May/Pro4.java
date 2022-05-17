import java.util.Scanner;

class Demo
{
	public static void main(String [] args)
	{
		// Arithmetical + - * / %
		int fnum,snum;
		int result; // Local Variable
		
		Scanner sc = new Scanner(System.in);
		
		// nextByte() nextShort() nextLong() nextFloat()
		System.out.print("First Number : ");
		fnum = sc.nextInt(); 
	
		System.out.print("Second Number : ");
		snum = sc.nextInt();
		
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
