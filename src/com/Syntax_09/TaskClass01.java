package com.Syntax_09;

public class TaskClass01 {

	public static void main(String[] args) {
		/* Create an array store 4 different prices
		 * Find an average of spending
		 */
		
		double[] prices=new double[4];
		
		prices[0]=50.0;
		prices[1]=40.5;
		prices[2]=90.8;
		prices[3]=100.87;
		
		double avg=(prices[0]+prices[1]+prices[2]+prices[3])/4;
		
		System.out.println(avg);
			

	}

}
