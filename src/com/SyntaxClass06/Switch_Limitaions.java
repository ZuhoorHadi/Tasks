package com.SyntaxClass06;

import java.util.Scanner;

public class Switch_Limitaions {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your answer?");
		String response=scan.next();
		
		char answer='Y';
		
		switch (answer) {
		case 'Y':
			response="Yes";
			break;
			
		case 'N':
			response="No";
			break;
			
		case 'M':
			response="Maybe";
			
			default:
				response="invalid";
				
		}
		
		System.out.println("answer");
		
	}

}
