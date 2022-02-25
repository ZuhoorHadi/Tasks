package com.SyntazClass05;

import java.util.Scanner;

public class ScannerSlefPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name	=scan.nextLine();
		System.out.println(name);

		System.out.println(" What is your city?");
		String city=scan.nextLine();
		System.out.println(city);
		
		System.out.println("What is your income?");
		double income=scan.nextDouble();
		System.out.println(income);
		
		System.out.println("How much loan do you need?");
		int loan=scan.nextInt();
		System.out.println(loan);
		
		if (loan>=300) {
			System.out.println("You are eligible for the loan");
			
		}else {
			System.out.println("Contact the loan specialist");
		}
		
	}

}
