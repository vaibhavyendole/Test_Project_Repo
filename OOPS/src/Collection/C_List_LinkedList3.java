package Collection;

import java.util.LinkedList;

public class C_List_LinkedList3 {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("Vaibhav");
		ll.add("Yendole");
		ll.add(85.86f);
		ll.add('A');
		ll.add(9.5f);
		ll.add("Apche200");
		
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(3, 'B');
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.set(2, 95.86f);
		System.out.println(ll);
	}
}
