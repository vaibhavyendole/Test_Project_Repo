package Array;				//import function from library
import java.util.Arrays; 	// Whenever call Array.sort();
public class AscendingArray
{
	public static void main(String[] args)
	{
		String[] country = new String[5];
		country[0] = "India";
		country[1] = "England";
		country[2] = "USA";
		country[3] = "Mexico";
		country[4] = "Finland";
		
		System.out.println(country[4]);
		System.out.println(country.length);
		
		Arrays.sort(country);
		for(int c=0; c<=country.length-1;c++)
		{
			System.out.println(country[c]);
		}
	}
}
// 1. Note that if your are using Arrays.sort() then 
//    null value is not acceptable while sorting
// 2. Length=Total numbers of character/strig/int value present
// 3. Index  = Position of String/int/character
// 4. Indexing start from 0			 (not 1)




