package Constructor;

public class ZSample2 
{
	String StudentName;
	int StudentRollNum;
	char StudentGrade;
	float StudentPercent;
	
	ZSample2(String SName, int SRoll,char SGrade, float SPer  )
	{
		StudentName = SName;
		StudentRollNum = SRoll;
		StudentGrade=SGrade;
		StudentPercent=SPer;
	}
	
	public void studentinfo()
	{
		System.out.println(StudentName);
		System.out.println(StudentRollNum);
		System.out.println(StudentGrade);
		System.out.println(StudentPercent);
	}
}
