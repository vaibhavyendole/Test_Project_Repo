package LogicalProgramming;

import java.util.Arrays;

public class B_Compare_Two_IntArray {
	public static void main(String[] args) {
		int ar1[]= {10,20,30};
		int ar2[]= {40,50,60};
		int ar3[]= {40,50,60};
		
		//Compare array1 and array2
		System.out.println(Arrays.equals(ar1, ar2));	//false
		
		//Compare array1 and array3
		System.out.println(Arrays.equals(ar1, ar3));	//false
		
		//Compare array2 and array3
		System.out.println(Arrays.equals(ar2, ar3));	//true
}}
