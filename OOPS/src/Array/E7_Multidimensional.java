package Array; // Multidimensional Array (2 Rows X 3 Columns)
public class E7_Multidimensional
{
	public static void main(String[] args)
	{
		int[][] ar1 = new int[2][3];	//2 Rows and 3 Coulmns
		//			0		1		2
		//	0		10		20		30
		//	1		40		50		60
		ar1[0][0] = 10;
		ar1[0][1] = 20;
		ar1[0][2] = 30;
		ar1[1][0] = 40;
		ar1[1][1] = 50;
		ar1[1][2] = 60;
							//Outer Loop for Rows
		for(int a=0; a<=1; a++)
		{
							// Inner loop for Columns
			for(int b=0;b<=2; b++)
			{
				System.out.print(ar1[a][b]+" ");//only print
			}
			System.out.println();
		}
	}		//Note : For inner loop use on print function
}			// println is used for Outer loop
