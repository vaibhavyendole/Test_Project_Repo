package Types_of_Variables;

public class sample4 
{int a=40;			//non-static global variable from same class

public static void main(String[] args) {

	//3. non-static global variable call from same class		
	sample4 s4= new sample4();		// create object of same class or current
	System.out.println(s4.a);		// objectName.variable  
				
	//4. non-static global variable call from diff class
	sample5 s5 =new sample5();		// create object of diff class
	System.out.println(s5.b);		// objectName.variable
	
}

public void m3() 
{
	System.out.println(a);
}

public static void m4() 
{
	//System.out.println(a);
}


}
