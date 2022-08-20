package Types_of_Variables;

public class Static_Global_Variable 
{
	static int a = 10;
	
	public static void main(String[]args)
	{
	//1. Static global variable call from same class
		System.out.println(a);
		
	//2. static global variable call from different class
		System.out.println(Static_Global_Variable_Another_Class.b);
	}							//classname.VariableName
	public static void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(a);
	}
	
}

