package Encapsulation;

public class Z1 {
	//Step.1 Declaration DM with global and private
	int num1 = 10;
	int num2 = 20;
	
	//Step.2 Initialize into constructor with access level public
	Z1(int a, int b)
	{
		num1=a;
		num2=b;
	}
	//Usage : utilize within method with access level public
	public void multiplication()
	{
		int mul = num1*num2;
		System.out.println(mul);
	}
	
	

}
