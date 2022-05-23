package pk1;

public class XYZ extends ABC 
{
	public void hello() 
	{
		System.out.println("XYZ Hello ...... ");
	}
	
	// Overridding : Redefine Parent Class Methods
	public void fun2() 
	{
		System.out.println("XYZ Fun2 ..... ");
	}
	
	public void fun3() 
	{
		super.fun3();
		System.out.println("XYZ Fun3 ..... ");
	}
}
