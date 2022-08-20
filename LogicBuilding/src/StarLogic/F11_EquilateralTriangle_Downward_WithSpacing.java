package StarLogic;
public class F11_EquilateralTriangle_Downward_WithSpacing
{
	public static void main(String[] args)
	{	// Equilateral Triangle Downward With Space
		//* * * * * 
		// * * * * 
		//  * * * 
		//	 * * 
		//	  *
		int space = 0;		// No of Space in First Row
		int  star = 5;		// No of Starts in First Row
		for(int a=1; a<=5; a++)			// Outer For Loop
		{
			for(int b=1; b<=space; b++)		//Inner For Loop
			{
				System.out.print(" ");
			}
			for(int c=1; c<=star; c++)		//Inner For Loop
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
	}
}
