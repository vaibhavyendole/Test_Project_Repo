package Collection_Set;
import java.util.ArrayList;
import java.util.TreeSet;
public class C_Set_TreeSet3 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Yendole");
		al.add("Vaibhav");
		al.add("Apache200");
		//al.add(200);only String allowed
		System.out.println(al);	// Sort result sequential
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(10);
		System.out.println(ts);// Sort the result ascending
}}
