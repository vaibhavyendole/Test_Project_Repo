package Methods;
public class Nonstatic 
{public static void main(String[] args) 
	{
		// classname objectname = new classname(); // Object Creation
	
	Nonstatic o1 = new Nonstatic(); // object creation
									
	o1.m5();						// objectname.methodname();
	o1.m6();
								// Nonstatic = datatype
								// o1 = objectname
	}							// new = keyword to create blank object
								// classname() --> Constructor
								// Copy all members of class into object
// Non Static Regular Method
public void m5()
{
	System.out.println("Running Non Static Regular MEthod m5 from same class");
}

public void m6()
{
	System.out.println("Running Non Static Regular MEthod m6 from Same Class");
}

}
