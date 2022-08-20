package LogicalProgramming;

import java.util.Scanner;

public class E_Find_EvenOdd_No {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//Scanner ; java.util
												// scanner(inputStream Source)
		System.out.println("Enter Number");
		int num = scan.nextInt();
		
		if( num % 2 == 0)
		{
			System.out.println("Entered No is Even");
		}
		else
		{
			System.out.println("Entered No is Odd");
		}
	}
}
