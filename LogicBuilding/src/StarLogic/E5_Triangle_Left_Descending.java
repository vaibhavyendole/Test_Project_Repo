package StarLogic;
public class E5_Triangle_Left_Descending
{
	public static void main(String[] args)
	{
		//*****
		//****
		//***
		//**
		//*
		//Step1 : Count Rows = 5; 	Count Columns = 5
		int star = 5;	// No of star present in first row
		for(int i=1; i<=5; i++)		// Outer loop for rows
		{
			for(int j=1; j<=star; j++)	// inner loop for 
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
}
