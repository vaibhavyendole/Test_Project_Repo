package Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class B_List_Vector2
{
 public static void main(String[] args)
 {	Vector v = new Vector();
	v.add("Nairobi");
	v.add("Tokyo");
	v.add("Denver");
	v.add("Berlin");
	v.add("Jarvis");
	v.add("Nairobi");
	
	System.out.println("--Print Vector Using Iterator Cursor---");
	Iterator itr = v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	System.out.println("--Print Vector Using ListIterator Cursor---");
	ListIterator litr = v.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
 }
}














