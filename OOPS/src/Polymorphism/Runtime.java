package Polymorphism;

public class Runtime 
{
	public static void main(String[] args) 
	{
		Runtime_Son s1 = new Runtime_Son();
		s1.Home();		// Override proprties
		s1.Land();		// Override proprties
		s1.Money();		// No Change in Money
		s1.laptop();	// Property of the Son
	}
}
