package Array;
public class IntExample
{
public static void main(String[] args)
{
 int [] Salary = new int[4];   //Length = 4
 Salary[0] = 100000;	// Index = (Length - 1)
 Salary[1] = 200000;	// because indexing start from 0
 Salary[2] = 150000;	// i.e if length is 4 then index is 3
 Salary[3] = 50000;
 
 System.out.println(Salary[1]);	//200000
 System.out.println(Salary.length); //4
 // for(int i = 0; i<=4; i++)
 	for(int i=0; i<=Salary.length-1; i++ )
 	{
 		System.out.println(Salary[i]);
 	}
}
}
