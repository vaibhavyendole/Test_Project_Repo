package Inheritance;

public class C_TestClass
{
public static void main(String[] args)
{
	B_Son2 s2 = new B_Son2();
	s2.mobile(); //Son2 has 3 Mobile
	
	
	A_Son s1 = new A_Son();
	s1.mobile(); //Son has 4 mobile
	
	A_Son s3 =  new B_Son2();
	s3.mobile(); //Son2 has 3 Mobile
	
	



}
}


