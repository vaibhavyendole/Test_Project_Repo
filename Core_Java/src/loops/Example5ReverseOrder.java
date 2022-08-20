package loops;
							// For Descending Order or Reverse
public class Example5ReverseOrder 
{
	public static void main(String[] args)
	{
		for (int i=22; i>=2; i=i-2)	// (Start; End; Decrement Step)
								
		{						
			System.out.println(i);
		}		
	}			
}
// Warning : For Increment by 1 use (i++) Never Use (i=i++)
// Warning : For Decrement by 1 use (i--) Never Use (i=i--)
// 			 For Increment by 2 Use (i=i+2)
// 			 For Decrement by 2 Use (i=i-2)