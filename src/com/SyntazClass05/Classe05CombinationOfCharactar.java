package com.SyntazClass05;

import java.util.Scanner;

public class Classe05CombinationOfCharactar {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 3 different values");

 
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than" +num2);
		}else {
			System.out.println(num3+" is the largest number");
		}
				
		if (num2>num3) {
			System.out.println(num2+"is the largest");
		}else {}
		System.out.println(num3+" is the largest number");
	}

}
