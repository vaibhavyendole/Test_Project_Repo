package Method_With_Return_Type;

public class MethodWithReturnType 
{
	public static void main(String[] args)
	{
		multiplication(10,15);
	}
	
	public static int multiplication(int a, int b)
	{
		int mul = a*b;
		System.out.println(mul);
		return mul;
	}

}
