package oops;

public class Pro3 
{
	public static void main(String[] args) 
	{
		/* 
		 Constructor : It is a special member method of your class. It is special
		  			because it's name is just same as class name with no return type
		  			and also there are no need to call it explicitly.
		  			It is called automatically when the new object is created. It is
		  			basically used for initializing the data members. 
		  			Mostly it is public. 
		 * */
		
		/*
		 this : this is a keyword and basically work as reference, and it point
		  		to current Object
		 * */
		Student ob1 = new Student(101,"Vikas",23,"indore",345.54f);
		Student ob2 = new Student();
		Student ob3 = new Student(103,"Meena","ujjain");		
		Student ob4 = new Student(ob1);
		
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}	
}
