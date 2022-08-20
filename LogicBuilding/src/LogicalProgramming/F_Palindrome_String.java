package LogicalProgramming;

public class F_Palindrome_String {
	public static void main(String[] args) {
// Palindrome : a word, phrase, or sequence that reads the same backwards as forwards,
//e.g. madam or nurses run.
	
		String org = "eye"; 			// Eye and eye are different
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i --)
		{
			rev = rev + org.charAt(i);
		}
	System.out.println("Orginal String :"+org);
	System.out.println("Reverse String :"+rev);
	if(org.equals(rev))
	{
		System.out.println("Given String is a Pallindrome");
	}
	else
	{
		System.out.println("Given String is Not a Pallindrome");
	}	
	}
}







