package LogicalProgramming;

public class G_ArmStrong_Number {
	public static void main(String[] args) {
		//Armstrong number is a number that is equal to the sum of 
		//cubes of its digits. For example
		//0, 1, 153, 370, 371 and 407 are the Armstrong numbers
		
		int orgNum = 371;
		int sum = 0;
		
		for(int i=orgNum; i > 0; i = i/10)
		{
			int rem = i % 10;
			sum = sum + (rem*rem*rem);
		}
		
		if(orgNum==sum)
		{
			System.out.println("Given Number "+orgNum+" is Armstrong Number");
		}
		else
		{
			System.out.println("Given Number "+orgNum+" is NOT Armstrong Number");
		}
			
	}
}
