package com.SyntaxClass06;

public class LargestNumberCleaner {

	public static void main(String[] args) {
		
		// Find the largets number among the 3 given number and then define wethear largetst is eve or odd
		// in this type of cases there will be asking for default variable 
		
		int largest=0;
		
		int num1=1000;
		int num2=2000;
		int num3=3001;
		
		if (num1>num2 && num1>num3) {
			largest=num1;
			
		}else if(num2>num1 &&num2>num3){
			largest=num2;
			
		}else if(num3>num1 && num3>num2){
				largest=num3;
		}else {
			System.out.println(largest);
			
		if (largest%2==0) {
			System.out.println(largest+" is even number");
		}else {
			System.out.println(largest+ " is odd number");
		}
		}
		
		

	}

}
