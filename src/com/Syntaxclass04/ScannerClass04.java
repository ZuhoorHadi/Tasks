package com.Syntaxclass04;

import java.util.Scanner;

public class ScannerClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* scanners are used to have more interactive, but
		 * we do not use the scanners as automatic testers in daily tasks.
		 * None primitive 1- String 2- Scanner
		 * Scanner is a non primitive type of data 
		 * 
		 */
		
		Scanner input=new Scanner(System.in);// need import the scanner from the system.
		
		// it gives error and we need to import the scanner into our class.
		// As soon as we right the code or import the scanner into our environment the "console " section
		// will be activated. 
		// if you want to capture single STring-> use next
		
		System.out.println("please write your name");// type String and hit enter.
		
		String name=input.next();//type String and hit enter.
		
		System.out.println("Your name is "+ "Zuhoor");
		
		
		
		
		
		
		
		
		
		
	}

}
