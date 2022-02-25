package com.SyntazClass05;

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();

		System.out.println("Please enter your age");
		int age = input.nextInt();

		System.out.println(" Where do you live?");

		System.out.println("your name is" + name + "your age is" + age + "you live");

		String place = input.next();

		System.out.println("Please enter boolean");
		boolean booleanvalue = input.nextBoolean();

		System.out.println("Please enter you douuble value");
		double value = input.nextDouble();

		System.out.println("Please enter your char value");
		char character = input.next().charAt(0);
		
		// next Vs NextLin
		
		System.out.println("Capture the next one");
		String value2=input.next();

	}

}
