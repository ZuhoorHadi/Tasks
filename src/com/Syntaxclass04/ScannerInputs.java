package com.Syntaxclass04;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {
		// Steps to create a scanner and assigned a variablee.
		// to import scanner :Ctrl+Shft+Alt+O
		
		Scanner scan =new Scanner(System.in);
		
		//Step 2: Specify the instruction
		System.out.println("Please enter where are you from?");
		
		//Step 3" Capture the string value-->Use next();
		String country=scan.next();
		System.out.println("You are from "+ country);
		
		
	}

}
