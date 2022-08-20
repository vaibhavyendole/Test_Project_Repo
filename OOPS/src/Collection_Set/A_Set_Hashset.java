package Collection_Set;

import java.util.HashSet;

public class A_Set_Hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("Vaibhav");
		hs.add("Vaibhav");
		hs.add("Yendole");
		hs.add("8669076673");
		hs.add(95.68f);
		hs.add('A');
		
		System.out.println(hs);		//Randomly Saved 
		System.out.println(hs.size());
		System.out.println(hs.contains("Vaibhav"));
		hs.remove("Vaibhav");
		System.out.println(hs);
		hs.add("Vaibhav");
		System.out.println(hs);
		//hs.set not available because of no indexing 	
	}
}
