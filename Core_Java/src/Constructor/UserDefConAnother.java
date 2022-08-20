package Constructor;
public class UserDefConAnother 
{	//Step1: variable declaration
	float displacement;
	float timeInMin;
		//Step2: variable initialization	// Create User Constructor
	UserDefConAnother()	// Name of Constructor and ClassName Must be Same
	{
		displacement = 503;
		timeInMin	 = 40;
	}
		//Step3: usage
	public void velocity()
	{
		float vCity = displacement/timeInMin;
		System.out.println(vCity);
	}
	//Step3: usage
		public void addition()
		{
			float add = displacement+timeInMin;
			System.out.println(add);
		}
}










