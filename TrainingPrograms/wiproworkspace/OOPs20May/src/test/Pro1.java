package test;

public class Pro1 {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.x = 10;		
		Demo d2 = new Demo();
		d2.x = 23;		
		Demo d3 = new Demo();
		d3.x = 45;
		
		//d1.y = 100;
		Demo.y = 100;		
			
		d1.show();
		d2.show();
		d3.show();		
		
	}

}
