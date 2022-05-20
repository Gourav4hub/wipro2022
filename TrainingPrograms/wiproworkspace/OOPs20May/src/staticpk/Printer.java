package staticpk;

public class Printer 
{
	private static Printer obj;
	
	private String message;
	private Printer(String message)
	{
		this.message = message;
	}
	
	// Factory Methods
	public static Printer getObject(String message) 
	{
		if(Printer.obj==null)
		{
			Printer.obj = new Printer(message);
			return Printer.obj;
		}else 
		{
			Printer.obj.message = message;
			return Printer.obj;
		}
	}
	
	public void print() 
	{
		System.out.println("Message Printing...... ");
		System.out.println(this.message);
	}
}

/*
 		1. Not allow anyone to create object of Printer Class
 		2. Printer class provide it's object if anyone needed
 		3. Only one object of Printer must be exist in system.  
 * */
 