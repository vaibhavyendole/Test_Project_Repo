package Collection_Set;
import java.util.Iterator;
import java.util.TreeSet;
public class C_Set_TreeSet2 {
public static void main(String[] args) {
	TreeSet Tset = new TreeSet();
	Tset.add("ABC");	
	Tset.add("BCD");
	Tset.add("CDE");
	Tset.add("DEF");
	Tset.add("EFG");
	Tset.add("FGH");
	Tset.add("AAA");
	
	System.out.println("--Print info in TreeSet Using Iterator Cursor--");
	Iterator itr = Tset.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("--Print info in TreeSet Using foreach Cursor--");
	for(Object s1:Tset)
	{
		System.out.println(s1);
	}
}
}
