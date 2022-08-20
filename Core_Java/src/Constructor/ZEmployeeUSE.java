package Constructor;

public class ZEmployeeUSE 
{
	public static void main(String[] args) 
	{
		zEmployee e1 = new zEmployee();
		e1.empID = 10;
		e1.empName = "Anand";
		e1.CEOName = "Harshada";
		
		zEmployee e2 = new zEmployee();
		e2.empID = 20;
		e2.empName = "Rohan";
		e2.CEOName = "Anil";
		
		e1.showInfo();		// ObjectName.ClassName();
		e2.showInfo();		// ObjectName.ClassName();
		
	}
}
