package Polymorphism;

public class Runtime_Son extends Runtime_Father
{
	public void laptop()
	{
		System.out.println("Son has a Laptop");	// Property of Son
	}
	
	public void Home()
	{
		System.out.println("Now Father Has 4 Mansion");
	}

	public void Land()
	{
		System.out.println("Now Father Has 200 Acres of Land");
	}
	
//	public void Money()			// Son Does not override money()
//	{
//		System.out.println("Father has Lot of Bitcoins");
//	}	
}
