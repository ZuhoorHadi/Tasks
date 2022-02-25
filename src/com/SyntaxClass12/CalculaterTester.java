package com.SyntaxClass12;

public class CalculaterTester {

	public static void main(String[] args) {
		
		Calculator simpleMathCalculator=new Calculator();
		simpleMathCalculator.add(); //add the number from class 10+10
		
		// create the object/method from the Calculator Class
		// This is an object from the Class,
		//this is used because we will have many methods
		// from one class.
		
		simpleMathCalculator.addNumbers(10,25);
		
		simpleMathCalculator.addNumbers(30,30);

		int number1=50;
		int number2=50;
		System.out.println(number1+number2);
	

	}

}
