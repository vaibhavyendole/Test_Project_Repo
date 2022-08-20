package Star_Examples;

public class Star_Box 
{
	//*****		// Rows = 3
	//*****		// Columns = 5			
	//*****		// Always Start with Rows (Outer loop)
	
	public static void main(String[] args)
	{
		// outer for loop for rows (Count rows) Here rows = 3
		for (int i=1; i<=3; i++)
		{
			//inner loop for columns ( Count columns) Here Col = 5
			for (int j=1; j<=5; j++)
			{
				System.out.print("*");	// Note : Use (Print) only
			}
			System.out.println();		// On next line use println
		}
			
	}
}
