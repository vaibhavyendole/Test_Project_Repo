package Methods;

public class Sample100
{
	
public static void main(String[] args)
	{
		BikeInfo("Apache200","MH-12 CD 0001", 210, 32.5f, 'A' );
	}

public static void BikeInfo (String Bname, String NPlate, int CC, 
								float Avg , char Brake)
	{
		System.out.println(Bname);
		System.out.println(NPlate);
		System.out.println(CC);
		System.out.println(Avg);
		System.out.println(Brake);
	}

}