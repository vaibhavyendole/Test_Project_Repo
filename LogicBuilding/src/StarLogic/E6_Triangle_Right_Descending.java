package StarLogic;

public class E6_Triangle_Right_Descending
{
	public static void main(String[] args)
	{
	//*****
	// ****
	//  ***
	//   **
	//    *
		int space = 0;		// On the First Row there is no space, space = 0;
		int star = 5;		// Outer Loop for the No of Rows = 5
				
	 for (int i=1; i<=5; i++)
	 {
		 for (int j=1; j<=space; j++ )	//1st consider inner for loop for the Space
		 {
			 System.out.print(" ");		// Use Single Space and on Print for Inner For Loop
		 }
		 
		 for (int j=1; j<=star; j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		 space++;
		 star--;
		 
	 }
	 
	}
}
