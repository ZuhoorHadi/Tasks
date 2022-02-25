package com.SyntaxClass06;

public class PracticeSession {

	public static void main(String[] args) {
		// Declare a variable to store a car and based on the value of the car find origin of the car.
		
		String car="BMW";
		String country;
		
		switch (car) {
		case "Ford":
			country="USA";
			break;
			
		case "Lada":
			country="Russia";
			break;
			
		case "Tyota":
			country="Japan";
			break;
			
			default:
				country="unknown";
		}
		
		System.out.println(car+ "is from"+country);
	}

}
