package Sample1;
public class NotepadPlus extends NotepadAnother
{
public void mobile()
{
System.out.println("Son has 4 mobiles");
}

public void laptop()
{
System.out.println("Son has MacPad");
}

public static void main(String[] args)
{
NotepadPlus n1 = new NotepadPlus();
n1.money();
n1.home();
n1.mobile();
n1.laptop();
}
}







