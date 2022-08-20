package Array;
import java.util.Arrays;
public class StringExample
{
	public static void main(String[] args)
	{
		String[] city = new String[5];
		city[0] = "Tokyo";
		city[1] = "Denver";
		city[2] = "Nairobi";
		city[3] = "Lisbon";
		city[4] = "Berlin";
	
	for(int i=0; i<=city.length-1;i++)
	{
		System.out.println(city[i]);
	}
	System.out.println("--------Arranged Aphabetically----");
	Arrays.sort(city);
	for(int i=0; i<=city.length-1;i++)
	{
		System.out.println(city[i]);
	}
	}
}
