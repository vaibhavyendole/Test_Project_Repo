package LogicalPractise;

public class D_REverseString {
public static void main (String [] args)
{
String org = "ABCD";
String rev = "";

for(int i = org.length()-1; i>=0; i--)
{
rev = rev + org.charAt(i);

}
System.out.println("Orginal String "+org);
System.out.println("original String "+rev);


}
}
