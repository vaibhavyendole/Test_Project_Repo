package This_Super_Class;

public class Sample2 extends Sample1
{
	
	int a = 10;	//Global variable from same/current class
public void m1()
{
	int a = 20;	// Local Variable
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
}
