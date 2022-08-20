package StarLogic;

public class F14_ButterFly {
	public static void main(String[] args) {
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         * ( Remember : Star Space Space Star)
		
		int star = 1;	// Star on the first Row Left
		int space = 5;	// Space on the first Row Left
		int star2 = 1;	// Star on the first Row Right
		int space2 = 4;	// Space on the first Row Right
	
		for(int i=1; i<=9; i++)	//Outer for loop used for No. of Rows = 9
		{
			for(int j=1; j<=star; j++)	// Inner For loop for Star(Left)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space; k++) // Inner For loop for space(Left)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=space2; m++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=star2;l++) 
			{
				System.out.print("*");	// Inner For loop for Star(Right)
			}
			
			if(i<5)
			{
				star++;
				space--;
				star2++;
				space2--;
			}
			else
			{
				star--;
				space++;
				star2--;
				space2++;
			}	
			System.out.println();
		}
		}
}
