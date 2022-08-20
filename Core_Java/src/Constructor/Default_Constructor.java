package Constructor;

public class Default_Constructor 
{
	//	default constructor---> provided by compiler
	//	use1: to copy all the members of class into object --> after object creation
	//	Default_Constructor() {
	//		
//	}

public static void main(String[]args)
{
	Default_Constructor o1 =new Default_Constructor();
	o1.m2();
}

public void m2()
	{
		System.out.println("Running method m2 from same class");
	}

}
