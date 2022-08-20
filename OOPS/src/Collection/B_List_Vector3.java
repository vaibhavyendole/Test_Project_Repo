package Collection;
import java.util.Enumeration;
import java.util.Vector;
public class B_List_Vector3
{	public static void main(String[] args)
	{		Vector v= new Vector();
		v.add("Nairobi");
		v.add("Tokyo");
		v.add("Denver");
		v.add("Berlin");
		v.add("Jarvis");
		v.add("Nairobi");
	
	System.out.println("--Print Vector Using For Loop--");
	for(int i =0; i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	
	System.out.println("--Print Vector Using For eachLoop--");
	for(Object s1:v)
	{
		System.out.println(s1);
	}
	
	System.out.println("--Print Vector Using enumeration cursor--");
	Enumeration enu = v.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	}	}	}



















