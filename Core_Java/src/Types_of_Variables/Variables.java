package Types_of_Variables;
public class Variables 
{
		private static Variables s1;
		int a = 10;					// int a is declared globally
	public void m1()
	
	{								// int b declared inside the method
		int b = 20;					// so int b is local variable 
		System.out.println("Print thealue of b: "+b);
		System.out.println("Print thealue of a: "+a);
	}
	public void m2()
	{
		int c = 30;
		System.out.println("Print thealue of c: "+c);
		System.out.println("Print thealue of a: "+a);
	}
	public static void main(String[] args) 
	{
		Variables.s1 = new Variables(); // Classname.ObjectName = new Classname();
		s1.m1();		// create object bcoz Non Static Method Used				
		s1.m2();
		System.out.println(s1.a);
	}
}






