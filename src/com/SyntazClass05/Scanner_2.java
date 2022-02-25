package com.SyntazClass05;

import java.util.Scanner;

public class Scanner_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// next() VS nextLine()
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temp");
		int temp=scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter your city");
		String input=scan.nextLine();
		
		double farhenhiet=30;
		double celsiuse=scan.nextDouble();
		
		celsiuse= ((farhenhiet-32)*5)/9;
		System.out.println(celsiuse);
		int cel=scan.nextInt();
		
		
		

	}

}
