package control_Statement;
public class Else_If1 
{public static void main(String[] args)
{
	int Distance = 75;
	if (Distance>=100)
	{
		System.out.println(Distance+" KM is a Long Distance");
	}
	
	else if (Distance>=70)
	{
		System.out.println(Distance+" KM is a Medium Distance");
	}
	
	else if (Distance>=40)
	{
		System.out.println(Distance+" KM is a Short Distance");
	}
	
	else
	{
		System.out.println("Keep Walking");
	}
}
}
