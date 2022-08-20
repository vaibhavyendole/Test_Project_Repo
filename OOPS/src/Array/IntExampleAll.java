package Array;

public class IntExampleAll
{
	public static void main(String[] args)
	{
		int[] EmployeeID = new int[5];
		EmployeeID [0] = 101;
		EmployeeID [1] = 201;
		EmployeeID [2] = 301;
		EmployeeID [3] = 401;
		EmployeeID [4] = 501;
		
		String[] EmployeeName = new String[5];
		EmployeeName [0] = "Virat";
		EmployeeName [1] = "Mahi";
		EmployeeName [2] = "Rohit";
		EmployeeName [3] = "KL";
		EmployeeName [4] = "Rishab";
		
		for(int a=0; a<=EmployeeID.length-1; a++)
		{
			for(int b=0; b<=EmployeeName.length-1; b++)
			{
				System.out.print(EmployeeID[a]+" ");
				System.out.println(EmployeeName[b]);
			}
			System.out.println();
		}
	}
		
}
