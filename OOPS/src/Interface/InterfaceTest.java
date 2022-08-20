package Interface;
public class InterfaceTest implements I1, I2{
	public void m1()
	{
		System.out.println("method m1 from Interface I1");
	}
	public void m2()
	{
		System.out.println("method m2 from Interface I1");
	}
	public void m3()
	{
		System.out.println("method m3 from Interface I2");
	}
	public void m4()
	{
		System.out.println("method m4 from Interface I2");
	}
	public static void main(String[] args) 
	{
		InterfaceTest t1 = new InterfaceTest();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();
	}
} 
