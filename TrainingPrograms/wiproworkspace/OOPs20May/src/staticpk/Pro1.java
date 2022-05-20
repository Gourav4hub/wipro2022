package staticpk;

public class Pro1 {

	public static void main(String[] args) {
		
		Printer pr1 = Printer.getObject("Hello All !");
		pr1.print();
		
		Printer pr2 = Printer.getObject("Hello Students !");
		pr2.print();		
		
		Printer pr3 = Printer.getObject("Good Morning !");
		pr3.print();
		//System.out.println(pr1.hashCode());
		//System.out.println(pr2.hashCode());
		//System.out.println(pr3.hashCode());
		
		
		
		
	}

}
