package Array;		// Declaration and Initialization in single step
public class E6_Array_DI_SingleStep
{
	public static void main(String[] args)
	{		// String
		String[] Players = {"Mahi","Virat","KL","Rishab"};
		
		System.out.println(Players.length);		//4
		System.out.println(Players[1]);			//Virat
		
		for(int a=0; a<=Players.length-1; a++)
		{
			System.out.println(Players[a]);
		}
			//int
		int[] DistanceKM = {50,100,150,200};
		
		System.out.println(DistanceKM.length);	//4
		System.out.println(DistanceKM[3]);		//200
		
		for(int b=0; b<=DistanceKM.length-1;b++)
		{
			System.out.println(DistanceKM[b]);
		}
	}
}
