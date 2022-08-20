package Collection_Set;
import java.util.TreeSet;
public class C_Set_TreeSet {
	public static void main(String[] args) {
		TreeSet Tset = new TreeSet();
		Tset.add("ABC");	
		Tset.add("BCD");
		Tset.add("CDE");
		Tset.add("DEF");
		Tset.add("EFG");
		Tset.add("FGH");
		Tset.add("AAA");
		//Tset.add(9857);	// Stores only homogeneous Value
		//Tset.add(null);	// Doesn't Accept null Value

			System.out.println(Tset); //Arrange in Ascending order
			System.out.println(Tset.size()); //7
						
			Tset.pollFirst();	// Remove First Object
			System.out.println(Tset);
			
			Tset.pollLast();	// Remove last object 
			System.out.println(Tset);
			
			Tset.remove("DEF");
			System.out.println(Tset);
						
			System.out.println(Tset.first());	//Display info at start position
			System.out.println(Tset.last());	//Display info at Last position
		}
}
