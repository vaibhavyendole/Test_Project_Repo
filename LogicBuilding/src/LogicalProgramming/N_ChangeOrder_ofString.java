package LogicalProgramming;

public class N_ChangeOrder_ofString {
	public static void main(String[] args) {
		String name = "abc pqr def ghi";
		String[] ar = name.split(" "); //(abc=0; pqr=1; def=2...)
		
		for(int i=0; i<=ar.length-1;i++)
		{
			if(i%2==0)	//For Sum Number
			{
				String s1 = ar[i];
				ar[i] = reverseString(s1);	//reinitialization of String for Even values
	
			}
		}
		
		for(int i=0; i<=ar.length; i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
	
	public static String reverseString(String inp)
	{
		String rev="";
		for(int i=inp.length()-1; i>=0; i--)
		{
			rev = rev+inp.charAt(i);
		}
		return inp;
	}
}
