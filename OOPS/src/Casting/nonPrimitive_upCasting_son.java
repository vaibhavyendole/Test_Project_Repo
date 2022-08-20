package Casting;
public class nonPrimitive_upCasting_son extends
Casting.nonPrimitive_upCasting_Father
{
	public void mobile()
	{
		System.out.println("Son Has Iphone11");
	}
	public void house()
	{
		System.out.println("Father has 2 mansion");
	}
	public void car()
	{
		System.out.println("Father has 1 Audi8 and 1 Rolls-Royce");
	}
	public static void main(String[] args) 
	{
		nonPrimitive_upCasting_son s1 = new nonPrimitive_upCasting_son();
		s1.mobile();
		s1.house();
		s1.car();
		
		nonPrimitive_upCasting_Father s2 = new nonPrimitive_upCasting_son();
		s2.house();
		s2.car();
	}}












