package Methods;

public class AllMethods 
{
	public static void main(String[] args) 
	{
		m1(); 								 // Static Regular Method Same Class
		AllMethods NSMSC = new AllMethods(); // Object Creation
		NSMSC.m2();							 // Non Static Method From Same Class
		
		AllMethodsAnotherClass.Another1();	 // Static Regular MEthod From Another CLass
		AllMethodsAnotherClass NSMAC = new AllMethodsAnotherClass(); // Object Creation
		NSMAC.Another2(); 					 // Non Static Method From Another Class
	}

	
	public static void m1()					// Static Regular Method Same Class
	{
		System.out.println("1. Printing Static Regular Method m1 From Same Class");
	}
	
	public void m2()						// Non Static Regular Method Same Class
	{
		System.out.println("2. Printing Non Static Regular Method m2 From Same Class");
	}
}
