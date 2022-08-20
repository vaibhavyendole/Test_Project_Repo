package Inheritance;

public class H_Use 
{

	public static void main(String[] args) 
	{
	System.out.println("----------------Son1+Father----------");
		H_Son1 s1 = new H_Son1();
		s1.mobile();
		s1.land();
		s1.home();
	
	System.out.println("-----------------Son1+Father----------");
		H_Son3 s3 = new H_Son3();
		s3.laptop();
		s3.land();
		s3.home();
	}
}
