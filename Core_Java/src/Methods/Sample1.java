package Methods;
		// Example of Using Regular Method (Same Class)
public class Sample1 
{													// This is Main Method//
	public static void main(String[] args) // Main Method Declaration
	{
		
		System.out.println("Main Method Started");
		
		regular();			// Regular--> MethodName();		Method Call
		regular2();
		
		System.out.println("Main Method Ended");
		
											// This is Regular Method//
	}
		public static void regular()		// Regular Method Declaration
		{
			System.out.println("Running Static Regular Method");
		}
		
		public static void regular2()
		{
			System.out.println("Running Another Regular Static Method");
		}
}








