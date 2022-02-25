package com.Syntax_09;

public class HomeWork_4_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = new int[5];

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;
		
		
		int size=values.length;
		int sum=0;
		
		for (int i=0; i<size; i++) {
			
			sum+=values[i];
			
		}

		int maxNumber=values[0];
		
		for (int i=0; i<values[0];i++) {
			
			if(values[0]>maxNumber)
				maxNumber=values[0];
			
			System.out.println("Largest numbers is "+maxNumber);
			
		}
		
		
		
		
		
		
		
		int largest;

		int summ = (values[0] + values[1] + values[2] + values[3] + values[4]);

		System.out.println(summ);

		if (values[0] > values[1] && values[0] > values[2]) {
			largest = values[0];

		}

		else if (values[1] > values[2] && values[1] > values[3]) {
			largest = values[1];

		}
		if (values[2] > values[3] && values[2] > values[4]) {
			largest = values[2];

		}else {
			System.out.println(values[4]+" is the largest number");
		}

		/* is there
		 * 
		 */
		
	}

}
