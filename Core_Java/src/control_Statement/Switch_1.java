package control_Statement;

public class Switch_1 
{ public static void main(String[] args) 
	{
	String inp = "CSHWD";
	switch (inp) 
	{
	case "CSHWD": System.out.println("Withdraw the Cash");
	break;
	
	case "CSHDP": System.out.println("Deposit the Cash");
	break;
	
	case "INSATM": System.out.println("Insert ATM Card");
	break;
	
	default: System.out.println("Invalid Input");
	}	

	}	
}
