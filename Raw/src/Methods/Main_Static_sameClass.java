package Methods;

public class Main_Static_sameClass 
{
	public static void m1()
	{
		System.out.println("Runnig static method m1 from Same");
	}
	
	public void m2()
	{
		System.out.println("Running NonStatic Method m2 From Same Class");
	}
	
	public void m5(int a, int b)
	{
		int Sum = a + b;
		System.out.println(Sum);
	}
	
	public void m6(int a, int b)
	{
		int Sum = a + b;
		System.out.println(Sum);
	}

	public static void main(String[] args)
	{
		m1();						// MethodName		
		Main_Static_ZDiffClass.m3();// ClassName.MethodName();
		
		Main_Static_sameClass s1 = new Main_Static_sameClass();
		s1.m2();					//bjectName.MethodName();
		
		Main_Static_ZDiffClass d2 = new Main_Static_ZDiffClass();
		d2.m4();
		
		s1.m5(8, 100);
		s1.m6(110, 10);
		
	}
			

}
