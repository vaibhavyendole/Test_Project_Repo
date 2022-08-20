package StarLogic;
public class F10_EquilateralTriangle_Upward_WithSpacing
{
	public static void main(String[] args) {
		// Equilateral Triangle Upward With Space
		//   * 
		//  * * 
		// * * * 
		//* * * *
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++)		// Outer for loop
		{
			for(int j=1; j<=space; j++)		// Inner For Loop
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)		// Inner For Loop
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}
}
