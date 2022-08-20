package Array;

public class E8_Multidimensional_DI_SingleStep
{
	public static void main(String[] args)
	{
		String[][] City = {{"Pune","Mumbai"},{"Venice","Rome"},{"Berlin","Hamburg"}};
		
		for(int a=0; a<=2; a++)			//Count Rows: here 3 rows: length(3)-1 = 2
		{
			for(int b=0; b<=1; b++)	//Count Columns: here 2 Columns: length(2)-1 = 1
			{
				System.out.print(City[a][b]+" ");
			}
			System.out.println();
		}
		
		int[][] Km = {{10,20,30},{40,50,60},{70,80,90},{30,30,30}};
		for(int c=0; c<=3; c++) // Rows = 3
		{
			for(int d=0;d<=2; d++)	// Col = 3
			{
				System.out.print(Km[c][d]+" ");
			}
			System.out.println();
		}
	}
	
	
}
