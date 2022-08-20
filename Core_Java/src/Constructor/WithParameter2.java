package Constructor;
public class WithParameter2 
{
		int num3;						//Step1: variable declaration
		int num4;
		String sName;
		
		WithParameter2(int c, int d)	//Step2:variable initialization
		{
			num3 = c;
			num4 = d;
		}
		
		WithParameter2(String str)	//Step2:variable initialization
		{
			sName = str; 
		}
		
		public void multiply()			//Step3 : Usage
		{
			int mulValue = num3*num4;
			System.out.println("Mul Value = "+mulValue);
		}
		
		public void division()
		{
			int divValue = num3/num4;
			System.out.println("Div Value = "+divValue);
		}
		
		public void StudentName()
		{
			String Student = sName;
			System.out.println("Student Name = "+Student);
		}
}







