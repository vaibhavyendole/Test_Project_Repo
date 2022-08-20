package loops;

public class DoWhileLoop 
{
	public static void main(String[] args) 
	{
		int i=10;	//Start Condition
		do
		{
			System.out.println(i);
			i++;	// Increment or Decrement
		}
		while (i<=15); // End Condition
	}
}
// Note 1: In Do While Loop it will always print 1st or Start Condition
// whether remaining condition are true or false.
// Note 2: If After executing first condition if remaining conditions are 
// true then it will print all values otherwise only First Condition execute.
