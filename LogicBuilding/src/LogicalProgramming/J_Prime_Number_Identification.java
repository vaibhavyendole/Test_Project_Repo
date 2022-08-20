package LogicalProgramming;

public class J_Prime_Number_Identification
{
public static void main(String[] args) {
	//Prime Number : No. Divisible by 1 and Itself.
	// E.g 2,3,5, 7,11,13,17,23,29, 31,37,41,43,47,
	//53,59,91,67,71,73,79,83,9,97
	int num = 67;
	int count = 0;
	
	for(int i = 2; i<num; i++)
	{
		if(num % i == 0)
		{
			count++;
			break;
		}
	}
	if(count == 1)
	{
		System.out.println("Given Number is Non-Prime");
	}
	else
	{
		System.out.println("Given Number "+num+" is Prime");
	}
}}
