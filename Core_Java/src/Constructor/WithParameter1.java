package Constructor;
public class WithParameter1
{
	int num1;						//Step1: variable declaration
	int num2;
	
	WithParameter1(int a, int b)	//Step2:variable initialization
	{
		num1 =a;
		num2 =b;
	}
	
	public void addition()
	{
		int addValue = num1+num2;
		System.out.println("Add Value = "+addValue);
	}
	
	public void subtract()
	{
		int subValue = num1-num2;
		System.out.println("Sub Value = "+subValue);
	}
	
	public static void main(String[] args) 
	{
		WithParameter1 o1 = new WithParameter1(60,80);
				o1.addition();
				o1.subtract();
				
		WithParameter2 a1 = new WithParameter2(20,5);
				a1.multiply();
				a1.division();
				
		WithParameter2 a2 = new WithParameter2("Vaibhav");
				a2.StudentName();
	}
}











