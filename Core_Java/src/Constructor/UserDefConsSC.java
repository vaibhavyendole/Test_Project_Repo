package Constructor;				//user defined --> provided by user
		
public class UserDefConsSC 			//use1: to initialize global variable
{									//use2: to copy all the members of /n
//Step1: variable declaration		//class into object	
int speed;
int time;

//Step2: variable initialization	// Create User Constructor
UserDefConsSC()		// Name of Constructor and ClassName Must be Same
	{
		speed = 40;
		time = 10;
	}

//Step3: usage
public void distance()
	{
		int disValue = speed*time;
		System.out.println(disValue);
	}
	
public static void main(String[] args)
{
	UserDefConsSC o1 = new UserDefConsSC();	//Object Creation
		o1.distance();						//objectName.MethodName
	
		UserDefConAnother Another1 = new UserDefConAnother();
		Another1.velocity();
		Another1.addition();
		
}
}
