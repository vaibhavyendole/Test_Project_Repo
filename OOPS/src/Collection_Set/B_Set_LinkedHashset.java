package Collection_Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class B_Set_LinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Vaibhav");
		lhs.add("Vaibhav");
		lhs.add("Yendole");
		lhs.add('A');
		lhs.add(98.59f);
		lhs.add(111);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);	// Maintain the Sequence
		System.out.println(lhs.size());//6 . Duplicate not allowed
		
		System.out.println("--print info in LinkedHashSet using iterator cursor-");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--print info in LinkedHashSet using foreach loop-");
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
		System.out.println(lhs.contains("Vaibhav"));  //true
		lhs.remove("Yendole");
		System.out.println(lhs);
		lhs.clear();
		System.out.println(lhs.size());
		System.out.println(lhs);	
	}}













