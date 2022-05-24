package pk1;

public class Pro1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Faculty f1 = new Faculty();
		
		fun1(f1);
		fun2(f1);
	}
	
	private static void fun1(Person ob) 
	{
		ob.input();
		ob.show();
		ob.canVote();
	}
	
	private static void fun2(Student ob) 
	{
		ob.input();
		ob.show();
		ob.canVote();
	}
}
