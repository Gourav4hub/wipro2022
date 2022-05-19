package oops;

public class Pro1 
{
	public static void main(String[] args) 
	{
		Student ob1 = new Student();

		//Student ob1 = null;
		
		//Student ob2 = ob1;
		Student ob2 = new Student();
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		
		//ob1.input();			
		//ob1.show();
	}
}
