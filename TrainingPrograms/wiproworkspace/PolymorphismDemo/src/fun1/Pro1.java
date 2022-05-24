package fun1;

public class Pro1 {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.fun1();
		d1.fun2();

		Testing d2 = new Testing() 
		{			
			@Override
			public void fun2() {
					System.out.println("Fun2 .....");		
			}			
			@Override
			public void fun1() 
			{
				System.out.println("Fun1 .....");		
			}
		};
		
		d2.fun1();
		d2.fun2();
		
//		FunInterface d3 = ()-> {
//				System.out.println("Hellooo.....");
//			};
		FunInterface d3 = ()->System.out.println("Hellooo.....");
		d3.hello();
		
	}

}
