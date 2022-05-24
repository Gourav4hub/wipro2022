package pk1;

import java.util.Scanner;

public class Faculty extends Person 
{
	private int facid;
	private float salary;
	
	public Faculty() {	
	}
	
	public Faculty(int facid, float salary) {
		super();
		this.facid = facid;
		this.salary = salary;
	}

	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Facid : "); this.facid = sc.nextInt();
		System.out.print("Salary : "); this.salary = sc.nextFloat();
	}	
	
	public void show() 
	{
		super.show();
		System.out.println("FacId : " + this.facid);
		System.out.println("Salary : " + this.salary);
	}
	
}
