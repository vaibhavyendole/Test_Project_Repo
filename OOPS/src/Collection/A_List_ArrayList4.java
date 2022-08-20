package Collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class A_List_ArrayList4{
	public static void main(String[] args)
	{	ArrayList ar = new ArrayList();
		ar.add("Nirobi");
		ar.add("Tokyo");
		ar.add("Denver");
		ar.add("Berlin");
		ar.add("Jarvis");
		//1. Print ArrayList info using ListIterator cursor
		System.out.println("---Print ArrayList info using ListIterator cursor----");
		ListIterator Litr = ar.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		//2. Print ArrayList info using for loop cursor
		System.out.println("---Print ArrayList info using for loop cursor----");
		for(int i=0; i<=ar.size()-1; i++)
		{
			System.out.println(ar.get(i));
		}
		//3. Print ArrayList info Using foreach loop
		System.out.println("----Print ArrayList info Using foreach loop--");
		for(Object s1:ar)
		{
			System.out.println(s1);
		}		
	}
}
