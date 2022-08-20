package Types_of_Variables;

public class NonStatic_Global_Variable 
{
	
	int a = 10; 	//Non-Static Global Variable from Same Class
	public static void main(String[] args) 
	{
		//3. Non-Static Global Variable Call from Same Class
		NonStatic_Global_Variable s1 = new NonStatic_Global_Variable();
										// Create Object of Current Class
		System.out.println(s1.a);		//ObjectName.VariableName
							
		//4. Non-Static Global Variable Call from Different Class
		NonStatic_Global_Another_C s2 = new NonStatic_Global_Another_C();
							// Create Object From Different Class
		System.out.println(s2.b);	//ObjectName.VariableName
	}
	
	
	
	
	
	
	
	
	
	


}
