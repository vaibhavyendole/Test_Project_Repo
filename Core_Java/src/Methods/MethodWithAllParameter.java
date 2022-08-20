package Methods;

public class MethodWithAllParameter
{
public static void main(String[] args)
	{
		StudentInfo("Anand", 007, 'A',81.83f);
		System.out.println("------------------");
		StudentInfo("Dunjin", 01, 'Z',90.0f);
	
	}

public static void StudentInfo(String Sname, int RollNo, char SGrade, float SPer)
	{
		System.out.println(Sname);
		System.out.println(RollNo);
		System.out.println(SGrade);
		System.out.println(SPer);
	}
}
