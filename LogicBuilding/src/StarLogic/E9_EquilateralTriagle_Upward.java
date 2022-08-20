package StarLogic;

public class E9_EquilateralTriagle_Upward {
	public static void main(String[] args) {
		//   *
		//  ***
		// *****
		//*******
		
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++)	// Outer For loop; Rows=4;
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
}
