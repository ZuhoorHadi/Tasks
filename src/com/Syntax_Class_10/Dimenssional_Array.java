package com.Syntax_Class_10;

public class Dimenssional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*arrays stores data based on indexes
		 * 2D arrays have more than one arrays inside it.
		 * 
		 * 
		 */
		
		// idenitfiy the row ---0 and column 0

		int [] [] numbers=new int [3] [4];
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		// 2 row or second row
		
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		// 3 row
		
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
		numbers[2][3]=4000;
		
		System.out.println(numbers[1][2]);
		
		System.out.println(numbers[0][1]+numbers[1][0]);

		
		// 2D array is a array of 1D arrays
		
		
		
		
		
		
		
		
		
	}

}
