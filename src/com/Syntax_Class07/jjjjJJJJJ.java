package com.Syntax_Class07;

import java.util.Scanner;

public class jjjjJJJJJ {

	public static void main(String[] args) {
		
		// Create secret number
		//we want use to guess our secrete number
		
		// the moment user guessed my secrete number-->my program should stop
		//otherwise it should continue asking to guess my number
		
		
		int secreteNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		do {
			System.out.println("Please enter a number to wine");
			guessNumber=scan.nextInt();
			
		}while (guessNumber==secreteNumber);
		
		
				System.out.println("Congratulation!");
		

}

}
