package Methods;
										// Method With Parameter (int, int)
public class MethodWithParameter 
{
	public static void main(String[] args)
	{
		addition(2,3,4);
		MethodWithParameter m1 = new MethodWithParameter();
		m1.multiplication(4,5,6);
		
	}

	//1. Static Regular Method With Parameter from Same Class (2 int Parameter) (int,int)
	public static void addition(int a, int b, int c)
	{
		int sum = a + b + c;			
		System.out.println(sum);
	}
	
	//2. Non static Regular Method With Parameter from Same Class (2 int parameter) (int,int)
	public void multiplication(int a, int b, int c)
	{
		int mulvalue = a*b*c;
		System.out.println(mulvalue); 		// Dont use Double inverted Comma at mulvalue
	}
	
}
