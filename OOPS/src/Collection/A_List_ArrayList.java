package Collection;

import java.util.ArrayList;

public class A_List_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Vaibhav");
		al.add("Yendole");
		al.add("QA Automation");
		al.add("Pune");
		al.add("Apache200");
		al.add(9.5f);
		al.add('A');
		al.add(85000);
		al.add(null);

		System.out.println(al);		// will print all the value added
		System.out.println(al.size());					//9
		System.out.println(al.isEmpty());				//false
		System.out.println(al.contains("Apache200"));	//true
		System.out.println(al.get(3));					//Pune
	}
}




















