package Review_Arrays;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] array=new int [2][3];
		
		//1 row
		array [0][0]=10;
		array [0][1]=10;
		array [0][2]=10;

		// columns
		
		array [1][0]=10;
		array [1][1]=10;
		array [1][2]=10;

		System.out.println(array.length);
		
		int [][] numbers= {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(numbers.length);

		// get all elements from 2d arrays use for loop method
		
		for (int row=0; row<numbers.length; row++) {
			for (int cols=0; cols<numbers[row].length; cols++) {
				
				System.out.println(numbers[row][cols]);
			}
			
		}
		// get all elements from 2d arrays using for each loop
		
		for (int []nums:numbers) { //inside this loop specify the right side and the name of the array shows arrays
			for(int num:nums) {// check each element of the array numbers and name it "num"
				
			}
			System.out.println();
		}
		
		
	}

}
