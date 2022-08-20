package LogicalProgramming;

public class Demo
{
	public static void main(String[] args)
	{
		//*      *
		//**    **
		//***  ***
		//********
		//***  ***
		//**    **
		//*      *
			
		int star1 = 1;
		int space1 = 3;
		int star2 =1;
		int space2 = 3;
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=star1; j++)
			{
				System.out.print("*");
			}
			
			for(int k=1; k<=space1; k++)
			{
				System.out.print(" ");
			}
			
			for(int l=1; l<=space2; l++)
			{
				System.out.print(" ");
			}
			
			for(int m=1; m<=star2; m++)
			{
				System.out.print("*");
			}
			
			if(i<4)
			{
				star1++;
				star2++;
				space1--;
				space2--;
			}
			else
			{
				star1--;
				star2--;
				space1++;
				space2++;
			}
			
			
			System.out.println();
		}
		
		
		
		
	}	
}
