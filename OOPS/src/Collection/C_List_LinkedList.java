package Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class C_List_LinkedList
{
public static void main(String[] args)
{
	LinkedList ll = new LinkedList();
	ll.add("Nairobi");
	ll.add("Tokyo");
	ll.add("Denver");
	ll.add("Berlin");
	ll.add("Jarvis");
	ll.add("Nairobi");
	
	System.out.println("---Print LinkedList Using Iterator Cursor--");
	Iterator itr = ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("--Print LinkedList Using ListIterator--");
	ListIterator litr = ll.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("--Print LinkedList Using for Loop--");
	for(int i=0; i<=ll.size()-1; i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("--Print LinkedList Using foreach Loop--");
	for(Object s1:ll)
	{
		System.out.println(s1);
	}
}
}
