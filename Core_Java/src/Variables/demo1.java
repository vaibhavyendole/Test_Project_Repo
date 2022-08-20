package Variables;

public class demo1 {

	public static void main(String[] args) {
		//          		Types of Variable :
		//A) String--> for more than 1 character Eg Vaibhav23
		//B) int --> for numeric without decimal values Eg - 23,100
		//C) float --> for numeric with decimal valie - 99.23
		//D) char --> for only single character Eg A, c, W
		
		
		//1. Variable declaration ( Allocating /Reserve Memory)
		String StudentName;
		int StudentRollNo;
		float StudentPercent;
		char StudentGrade;
		
		//2. Variable Initialization
		StudentName = "Vaibhav"; //( for string use double inverted comma)
		StudentRollNo = 23;  //(for numeric value directly write value
		StudentPercent = 96.46f;
		StudentGrade = 'A';
		
		//3.Usage
		System.out.println(StudentName);
		System.out.println(StudentRollNo);
		System.out.println(StudentPercent);
		System.out.println(StudentGrade);
		
			
	}
}
