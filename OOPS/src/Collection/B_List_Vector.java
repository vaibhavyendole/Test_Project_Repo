package Collection;
import java.util.Vector;
public class B_List_Vector
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("Nairobi");
		v.add("Tokyo");
		v.add("Denver");
		v.add("Berlin");
		v.add("Jarvis");
		v.add("Nairobi");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("Tokyo"));
		System.out.println(v.get(3));
		
		// Data Manupulation
		v.add(4, "Helsinki");	//Right Shift
		System.out.println(v);
		v.remove(4);			//Left Shift
		System.out.println(v);
		
		// Data Updation
		v.set(4,"JarvisPC");
		System.out.println(v);
	}
}























