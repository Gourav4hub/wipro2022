package testpk;

public class Sample 
{
	private int a; // It is access only within the class
	
	public int b; // Inside a class and also outside a class via Object
	
	protected int c; // Inside a package and 
					// also access outside a package but in child class only
	
	int d; // Default : It is accessible only within a package
}
