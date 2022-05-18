package array;

public class Pro2 
{
	public static void main(String[] args) 
	{
		int arr[] = {44,55,33,22,76};
		
		System.out.println(arr[0]); // LowerBound
		System.out.println(arr[1]); 
		System.out.println(arr[2]); 
		System.out.println(arr[3]); 
		System.out.println(arr[4]);  // UpperBound (size-1)
	//	System.out.println(arr[5]);
		
		System.out.println("***************************");
		
		for(int i=0; i<5; i++) 
		{
			System.out.println(arr[i]);
		}
	}
}
