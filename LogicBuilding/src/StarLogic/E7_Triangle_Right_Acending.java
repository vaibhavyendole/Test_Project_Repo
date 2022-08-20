package StarLogic;

public class E7_Triangle_Right_Acending
{
	public static void main(String[] args)
	{
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int space = 4;		// Space in first row, space = 4
		int star = 1;		// star on first row, star = 1
		
		for(int i=1; i<=5; i++)		// Outer loop for No of Rows = 5
		{
			for(int j=1; j<= space; j++)	// 1st inner loop : Space 
			{
				System.out.print(" ");		// Don't Use Println()
			}
			for(int j=1; j<= star; j++)
			{
				System.out.print("*");
			}
		System.out.println();
		
		space--;
		star++;
		}
		
	}
}
