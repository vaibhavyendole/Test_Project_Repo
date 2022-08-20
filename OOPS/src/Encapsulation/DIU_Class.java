package Encapsulation;

public class DIU_Class {
	//Step.1 Declare the Variable globally with access level private
	private String name;
	
	//Step.2 Initialization : Initialize within a constructor with access level public
	public DIU_Class(String str1)
	{
		name = str1;
	}

	//Step.3 Usage : Utilize within a method with access level public
	public void myInfo()
	{
		System.out.println(name);
	}
}
