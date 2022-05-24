package pk1;

public class Pro3 {

	public static void main(String[] args) 
	{
		// Inherited / Override Method
		Person p1 = new Faculty();
		
		p1.input();
		p1.show();
		p1.canVote();
		
		if(p1 instanceof Student)
		{
			Student sd = (Student)p1;
			sd.payFees();
		}
	}

}
