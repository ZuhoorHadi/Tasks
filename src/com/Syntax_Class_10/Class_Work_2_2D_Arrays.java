package com.Syntax_Class_10;

public class Class_Work_2_2D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * *Create a 2D array(shorter way) 
		 * in which first array will consist of 4 names and second array will contain grades. 
		 * Then your program should print name of the students that has A and B grade
		 * NESTED LOOP "FOR"
		 * there are three dimensional arrays inside the big 
		 * 
		 * to find the number of elements use indexes
		 */
		 
		int [] [] numbers= {
				
				{10, 20, 30, 40},
				{100, 200, 300, 400},
				{1000, 2000, 3000, 4000},
		};
				
			int size=numbers.length;
			
			System.out.println(size);
			
		int sizeOf1Arr	=numbers [0].length;
		System.out.println(sizeOf1Arr);
		
		
		int sizeOf2Arr	=numbers [1].length;
		System.out.println(sizeOf2Arr);
		
		
		int sizeOf3Arr	=numbers [2].length;
		System.out.println(sizeOf3Arr);
		
		// Retrieving the elements from 2D arrays
		// there are two loops the utter loop and the inner loop
		// the inner loop retrieve the elements from each array
		// int number starts from the index 0
		// first check the inner loop until the condition is false 
		//once the condition false then goes to the outer loop and checks
		// it goes back and check and increment will happen to the outer loop
		// I have to find the length for row and column both.
		//
		
		
		for (int i=0; i<numbers.length; i++) {
			for( int j=0; j<numbers.length;  j++)
			
			System.out.println(numbers[i][j]);
			
			
			
			
			
			/*to identify the number of elements arrays (rows) use "length" {for (int i=0; food.length; i++)}option
			 * to identify the number of elements, arrays, (columns) use length.
			 * How to access the elements inside the loop--->use "System.out.print"
			 * in System.print the value should always come before the indexes values.
			 * example (numbers[i][j])
			 * 
			 */
			
			
		}
		
	}
	

}
