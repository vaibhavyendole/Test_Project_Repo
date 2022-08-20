package Access_Specifier;

public class Private_Class 
{
	int a = 20;
	private void m1()
		{
			System.out.println("Running Method M1");
		}
	
	public void m2()
	{
		System.out.println("Running Method M2");
	}
	
	public static void main(String[] args) 
	{
		Private_Class p1 = new Private_Class();
	System.out.println(p1.a);	
	}
}
