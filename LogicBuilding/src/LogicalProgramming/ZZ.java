package LogicalProgramming;

public class ZZ {
public static void main(String[] args)
{
int org = 1234;
String orgNum = Integer.toString(org);
String rev = "";
for(int i=orgNum.length()-1; i>=0; i--)
{
rev = rev + orgNum.charAt(i);
}
int revNum = Integer.parseInt(rev);
System.out.println(revNum);
}
}