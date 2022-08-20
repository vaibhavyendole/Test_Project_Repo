package Collection_Set;
import java.util.HashSet;
import java.util.Iterator;

public class A_Set_Hashset2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Vaibhav");
		hs.add("Vaibhav");
		hs.add("Yendole");
		hs.add("8669076673");
		hs.add(95.68f);
		hs.add('A');
		hs.add(null);
		
	System.out.println("--Print Hashset Using Iterator Cursor--");
	Iterator itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("--Print Hashset Using foreach loop--");
	for(Object s1:hs)
	{
		System.out.println(s1);
	}
	System.out.println("---Use Clear function--");
	hs.clear();
	System.out.println(hs);
	}
}









