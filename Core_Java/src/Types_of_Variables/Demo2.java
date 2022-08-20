package Types_of_Variables;

public class Demo2
{
	int a = 10; 			//non-static global variable from same class
	public static void main(String[] args) 
	{
		//3. non-static global variable call from same class
		Demo2 d1 = new Demo2();		// create object of same class or current
		System.out.println(d1.a);	// objectName.variable
		
		//4. non-static global variable call from diff class
		Demo1 d2 = new Demo1();		// create object of diff class
		System.out.println(d2.b); 	// objectName.variable
		
	}
	public void m3()
	{
		
	}

}
