package Access_Specifier;

 class Protected_Class 
{
	int a = 10;
	int b = 20;
	public void m1()
	{
		int sum = a+b;
		System.out.println("Addition of a & b = "+sum);

	}
	
	public static void main(String[] args)
	{
		Protected_Class p1 = new Protected_Class();
		
		p1.m1();
	}
}

