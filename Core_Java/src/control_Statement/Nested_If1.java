package control_Statement;

public class Nested_If1
{
	public static void main(String[] args) 
	{
		String UID = "abc";
		String PASS= "Vaibhav@123";
		if (UID =="abc") // Outer If
		{
			System.out.println("Correct UID");
			if (PASS=="Vaibhav@123") // Inner or Nested IF
				{
					System.out.println("Correct PASS");
				}
			else
			{
				System.out.println("Wrong PASS");
			}
		}	
		else
		{
			System.out.println("Wrong UID");
		}
	}	
}
