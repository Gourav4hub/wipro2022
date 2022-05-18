package loop;

public class Pro1 
{
	public static void main(String[] args) 
	{
		System.out.println("Looping start ... ");
		
//		for(int x=1; x<11 ; x++) 
//		{
//			System.out.println("\tHello : " + x);
//		}
		
//		int x = 1;
//		while(x<11) 
//		{
//			System.out.println("\tHello : " + x);
//			x++;
//		}
		
		int x = 15;
		do 
		{
			System.out.println("\tHello : " + x);
			x++; // 16
		}while(x<11);
		
		
		System.out.println("Looping end ... ");
	}
}
