package LogicalProgramming;

public class C_Multiply_2_Num_Without_Multiplication {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 7;
		
		int sum=0;
		for(int i=1; i<=num2; i++)
		{
			sum = sum+num1;
		}
		System.out.println(sum);	//35
	}
}
//Note : If you mention num2 in for then use num1 inside and Vice Versa