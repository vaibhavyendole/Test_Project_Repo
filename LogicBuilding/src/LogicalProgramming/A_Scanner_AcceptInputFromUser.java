package LogicalProgramming;
import java.util.Scanner;

public class A_Scanner_AcceptInputFromUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//For Numbers--> scan.nextInt()
		System.out.println("Enter Number1");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Number2");
		int num2 = scan.nextInt();
		
		System.out.println("Addition "+(num1+num2));	
		
		//For String -->
		System.out.println("Enter Student Name");
		String name = scan.next();
		System.out.println(name);
	}
}














