package control_Statement;
public class Else_If2
{public static void main(String[] args)
{
	int x = -5;
	int y = -10;
	if (x >=0 && y>=0)
	{
		System.out.println("Point Located in 1st Quadrant "+"X="+x+", Y="+y);
	}
	
	else if (x>=0 && y<=0)
	{
		System.out.println("Point Located in 2nd Quadrant "+"X="+x+", Y="+y);
	}
	
	else if (x<=0 && y<=0)
	{
		System.out.println("Point Located in 3rd Quadrant "+"X="+x+", Y="+y);
	}
	else if (x<=0 && y>=0)
	{
		System.out.println("Point Located in 4th Quadrant "+"X="+x+", Y="+y);
	}
	else
	{
		System.out.println("Invalid Entry");
	}
}
}
