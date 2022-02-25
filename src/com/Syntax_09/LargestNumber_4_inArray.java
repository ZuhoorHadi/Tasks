package com.Syntax_09;

public class LargestNumber_4_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the largest number compare all the number with each other
		// 
		
		int[]number= {15, 45, 10, 32};
		
		int largest=number[0];
		
		for (int i=0; i< number.length; i++) {
			
			if (number [i]>largest){
					largest=number[i];
					
					System.out.println(largest);
					
			}
			
			// using enchance for loop to find the largests
			
			
			largest=number[0];
			
			for (int num:number) {
				
			}
		}
		
		

	}

}
