package pk3;

import pk2.PQR;

public class Pro1 {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Sample s1 = new Sample();
		
		PQR p1 = new PQR();
		
		//MyData ob = new MyData("Wipro", p1);
		MyData ob = new MyData("Wipro", d1);
		ob.execute();
	}
}
