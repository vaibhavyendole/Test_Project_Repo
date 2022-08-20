package StarLogic;
public class F12_DescAsc_DecreasingIncreasing {
	public static void main(String[] args) {
		//----------------------------------------
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		//--------------------------------------
		//Step .1 Count Total no of Rows = 9; Use Outer for loop for No. of Rows
		int star = 5; 	//Count Total no of star in first Row
		for(int i=1; i<=9; i++)	// Outer for loop used for No. of Rows
		{
			for(int j=1; j<=star; j++)		// Inner for loop for Col
			{
				System.out.print("*");
			}
			System.out.println();
			//star--;
			if(i<5)			// OR (i<=4)	// For Descending star
			{
				star--;
			}
			else			// For Ascending star
			{
				star++;
			}
		}	
}
}
