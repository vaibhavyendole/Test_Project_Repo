package Sample1;

public class ExampleSet1
{
	double myDouble =9.78d;
	
	int myInt = (int) myDouble;
	public static void main(String[] args)
	{
				//1. Find the length of String
				String txt = "Hello";
				System.out.println("Lenth of Word = "+txt.length());
				// Output : Lenth of Word = 5
				
				
		//2. Convert Type of Data
		ExampleSet1 d1 = new ExampleSet1();
		System.out.println(d1.myDouble);
		System.out.println(d1.myInt);
		//Output : 9.78 and 9
		
		
					//3. Convert word to toUpperCase // toLowerCase();
					String txt2 = "Hello";			// Will print HELLO
					System.out.println(txt2.toUpperCase());
					// Output : HELLO
					
					
		//4. Return the index (position) of the first occurrence of "e" 
		//   in the following string:
		String txt3 = "Hello Everybody";
		System.out.println("Index of Letter = "+txt3.
		indexOf ("e"));
		// Output : Index of Letter = 1
		
		
					//5. Find out Index of Letter
					String txt4 = "Hello Everyone";
					System.out.println(txt4.indexOf("H"));
					// Output : 0
					
					
		//6. Logical and Operator
		 int x1 = 5;			// Returns true
		 System.out.println(x1 > 3 && x1 < 10);
		 // Output : true
		 
		 
					//7. Logical or Operator
					 int x2 = 5;			// Returns true
					 System.out.println(x2 > 6 || x2 < 3);
					// Output : false
					 
					 
		//8. Logical not operator
		 int x3 = 5;
		 System.out.println(!(x3 > 3 && x3 < 10));
		 // Output : false
		 
		 
					//9. Use of Inverted comma in String
					 String txt5 = "It\'s alright.";
					 System.out.println(txt5);	// It's alright.
					 // Output :It's alright.
					 
					 
		 //10. Use of Backslash in String
		 String txt6 = "The character \\ is called backslash.";
		 System.out.println(txt6);
		 // Output : The character \ is called backslash.
		 
		 
					//10. Use of Double Inverted comma in String
					 String txt7 = "My is \"Jacob\"";
					 System.out.println(txt7);
					 //Output : My is "Jacob"
		 
					 
		//11. Maths Problems : Maximum Min Value
		 int x = 5;			//random(); sqrt();
		 int y = 10;	
		 System.out.println(Math.max(x, y));
		 
					//12. Boolean USe
					 int a2 = 10;
					 int b2 = 20;
					 System.out.println(a2>b2);	// false
		 
					 
		 //13. Use of Break keyword
		 for (int i = 0; i < 10; i++)
		 {
			  if (i == 5)
			  {  
				  break;
			  }
			  System.out.println(i);
			}
		 //Output : Will print number 1 to 4 Only
		 
		 
		 
					//14. Use of Continue keyword
					 for (int i = 0; i < 10; i++)
					 {
						  if (i == 5)
						  { 
							  continue;
						  }
						  System.out.println(i);
						}
					//output : Print numbers 1 to 9 except No. 5
		 
					 
		 //15. Arrays
		 String[] cars = {"Volvo", "BMW", "Ford"};
		 System.out.println(cars[1]);
		 // Note: Indexing start from 0so print BMW when use 1
		 
		 
					 //16. Arrays Sequence Change
					 String[] carsM = {"Volvo", "BMW", "Ford"};
					 carsM[0]= "Opel";
					 System.out.println(carsM[0]);
					 // Output : Opel--- because Volvo replaced by Opel
					 
					 
		 //17. CFind out elements in String
		 String[] carsN = {"Volvo", "BMW", "Ford"};
		 System.out.println(carsN.length);
		 // Output : Will Print Length of Elements
		
		
		 
					 //18. Loop through the items in the cars array.
					 String[] carsO = {"Volvo", "BMW", "Ford"};
					 for(String i : carsO)
					 {
					   System.out.println(i);
					 }
					//Output : Print Names of Car
					 
		
		//19. Two dimentional Arrays
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers);
		
	}
}
