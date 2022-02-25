package com.Syntax_09;

public class Lesson_3 {

	public static void main(String[] args) {
		// length
		
		//How many elements inside array?
		//to access all elements 
		//
		
		
		char[]grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		int size=grades.length;
		System.out.println("Number of element is"+size);
		
		// we use for loop for the repetition...
		// here we use for loop because I know the number of repetition of which is here 4 times.
		// in the below if I select <= then I will get the error and the reason is the index (A, B. C, D)==4
		// the iteration happens and Java goes back checks and the condition is true but there is no grade specified
		// in the index for it.
		
		/*****************************************************************************************/
		
		
		for (int i=0;  i<grades.length; i++) {
			
			System.out.println(grades[i]+" ");
			
		}
		
		 int []arr=new int[5];

		    arr[0]=45;

		    arr[1]=78;

		    arr[2]=12;

		  arr[3]=67;

		  arr[4]=55;

		for (int i=0; i<arr.length; i++)  {

		    System.out.println(arr[i]);

		}



	}

}
