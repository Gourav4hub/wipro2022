package pk3;

public class MyData 
{
	private String title;
	private Test test; // Reference of Interface
	
	public MyData(String title, Test test) {	
		this.title = title;
		this.test = test;
	}
	
	public void execute() {
		System.out.println(this.title);
		this.test.fun1();
	}
	
}
