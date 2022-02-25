package com.SyntaxClass06;

import java.util.Scanner;

public class ClassTask_1 {

	public static void main(String[] args) {
		
		// Ask Country capture value
		// print languages for the countries
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter country name");
		String country=input.nextLine();
		
		 String Language;
		
		switch (country) {
		case "USA":
			Language="English";
			break;
			
		case"Afghanistan":
			Language="Dari";
			break;
			
		case "Russia":
			Language="Russian";
			break;
			
		case "Uzbakistan":
			Language="Uzbaki";
			
			default:
				Language="Invalid";
				break;
				
		}
		
		System.out.println("Language");

	}

}
