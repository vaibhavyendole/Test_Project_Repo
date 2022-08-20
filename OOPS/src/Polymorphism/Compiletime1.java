package Polymorphism;
								// Method - overloading
public class Compiletime1		// Compiletime Polymorphism
{
	public void Name(String City, String Country)		//(string, string)
	{
		System.out.println("City Name = "+City+" & Country = "+Country);
	}
	
	public void Name(String Country, int CountryCode)	//(string, int)
	{
		System.out.println("Country Name = "+Country+" & Countrycode = "+CountryCode);
	}
}
