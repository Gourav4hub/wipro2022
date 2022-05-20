package test;

public class Sample 
{
		// 	Class Attributes / Class Variables / Static Variables
		private static int y;
		
		// Data Members
		private int x;
		
		public static void setY(int y) 
		{
			Sample.y = y;
		}
		public static void showY() {
			System.out.println("Y : " + Sample.y);
			
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		// Member Methods
		public void show() 
		{
			System.out.println("\nX : " + this.x);
			System.out.println("Y : " + Sample.y);
		}
}
