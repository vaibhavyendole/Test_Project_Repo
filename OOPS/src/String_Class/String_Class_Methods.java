package String_Class;
public class String_Class_Methods
{
public static void main(String[] args)
{
	//	1. length()
	//	Will Print length of the string
	String Name ="Mr.Vaibhav Yendole";		// Length  = 18
	System.out.println(Name.length());
	// Output : 18 (Space also considered while counting)
	
	
	// 2. toUpperCase()
	// 3. toLowerCase()
	// Print the String in Uppercase or Lower Case
	String City = "Berlin";		 // Valid up to execution only
	System.out.println(City.toUpperCase()); // Output = BERLIN 	
	
	City = City.toUpperCase();	// Assigned value of UpperCase
	System.out.println(City); 				// Output = BERLIN
	
	System.out.println(City.toLowerCase());	// Output = berlin
	
	City = City.toLowerCase();  // Assigned value of LowerCase
	System.out.println(City);				// Output = berlin
	
	
	// 4. equals()
	// If two string values are exactly equal then print true
	// otherwise false. ( characters are case sensitive)
	String E1 = "Velocity";
	String E2 = "VELOCITY";
	String E3 = "VELOCITY";
	System.out.println(E1.equals(E2));		// Output = false
	System.out.println(E1.equals(E3));		// Output = true
	
	
	// 5. equalsIgnoreCase();
	// It will ignore case sensitive property only for equalsIgnoreCase();
	String E4 = "Velocity";
	String E5 = "VELOCITY";
	System.out.println(E4.equalsIgnoreCase(E5));	// Output= true
	
	
	// 6. contains()
	// Some sequential character also consist in other string
	String c1 = "ManchesterUnited";
	String c2 = "United";
	String c3 = "Unitedly";
	System.out.println(c1.contains(c2));	// Output = true
	System.out.println(c2.contains(c1));	// Output = false
	System.out.println(c1.contains(c3));	// Output = false
	
	
	// 7. isEmpty();
	// If the string has empty (not even space) then print true
	String E7 ="";
	String E8 = "Denver";
	System.out.println(E7.isEmpty());		// Output = true
	System.out.println(E8.isEmpty());		// Output = false
	
	
	// 8. charAt(int index); 				//charAt(3)
	// Will Print the single character of mentioned index value
	String C4 = "Christiano";
	System.out.println(C4.charAt(0));		// Output = C
	System.out.println(C4.charAt(1));		// Output = h
	System.out.println(C4.charAt(2));		// Output = r
	
	
	//  9. startWith();
	// 10. endWith();
	// Will print true if start value or end value matched with string value
	String s1 = "Apache220";
	System.out.println(s1.startsWith("Apa"));	// Output = true
	System.out.println(s1.startsWith("bpa"));	// Output = false
	System.out.println(s1.endsWith("220"));		// Output = true
	System.out.println(s1.endsWith("120"));		// Output = false
	
	
	// 11. substring() or substring(start int ,end int)
	// Will Print according to position of index mentioned
	String S2 = "CSKvsMI";				
	System.out.println(S2.substring(5));		// Output = MI
	// Note : Here 5 is the index and also start point i.e 
	// 5th position of index is considered in output
	System.out.println(S2.substring(0, 3));		// Output = CSK
	System.out.println(S2.substring(3, 5));		// Output = vs
	// Note that end point = (n+1)
	
	
	// 12. concat();
	// Combining two or more than two strings
	String C1 = "Ganpati";
	String C2 = "Bappa";
	String C3 = "Maorya";
	System.out.println(C1.concat(C2.concat(C3)));
	//Output = GanpatiBappaMaorya
	
	System.out.println(C1+" "+C2+" "+C3);
	//Output = Ganpati Bappa Maorya
	
	
	// 13. indexOf()   lastIndexOf()
	// indexOf(" ") --> print index of character Count from start Point
	// lastIndexOf(" ")--> print lastIndexOf Count from End Side
	String inf = "infinity";
	System.out.println(inf.indexOf("i"));			// output = 0
	System.out.println(inf.lastIndexOf("i"));		// output = 5
	
	
	// 14. replace()
	// replace()--> replace the 
	String R1 = "Learn Java";
	System.out.println(R1.replace("Java", "Selenium"));
	// Output = Learn Selenium
	
	System.out.println(R1.replace("Learn Java","Learn Java by Sanjay Sir"));
	// Output = Learn Java by Sanjay Sir
	
	
	
}
}

