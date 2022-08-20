package Collection;
import java.util.ArrayList;
public class A_List_ArrayList2
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);	System.out.println("--------ArrayList--------");
			System.out.println(al);
			System.out.println(al.size());
	
		//Insert information in Between ArrayList	//Right Shift Operation 
		System.out.println("--------Infromation Added----------");
		al.add(3, 400);
		System.out.println(al);
		System.out.println(al.size());
		//Output : [100, 200, 300, 400, 500, 600, 700, 800, 900]
		
		//Remove or Delete Infromation Between Arraylist  //Left Shift OPeration
		al.remove(3);	
		System.out.println("-----Remove Infromation from Arraylist----------");
		System.out.println(al);
		System.out.println(al.size());
	}
}
