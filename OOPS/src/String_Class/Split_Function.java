package String_Class;

public class Split_Function
{
	public static void main(String[] args)
	{
		String Study = "Velocity is the Best Classes in India";
		String[] Str = Study.split(" ");
		System.out.println(Str.length);
		
		for(int i=0; i<=Str.length-1; i++)
		{
			System.out.println(Str[i]);
		}
	}
}
