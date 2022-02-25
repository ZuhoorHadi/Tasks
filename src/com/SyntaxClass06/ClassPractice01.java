
package com.SyntaxClass06;

import java.util.Scanner;

public class ClassPractice01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int day=input.nextInt();

		 day = 7;

		String dayName;

		if (day == 1) {
			dayName = "Mondaay";

		} else if (day == 2) {
			dayName = "Tuesday";
		
		}else if (day == 3) {
			dayName = "Wednesday";
		
		}else if (day == 4) {
			dayName = "Thursday";
		
		}else if (day == 5) {
			dayName = "Friday";
		
		}else if (day == 6) {
			dayName = "Saturday";
		
		}else if (day == 7) {
			dayName = "Sunday";
			
			System.out.println(dayName);
			
		switch (day) {
		case 1:
				dayName="Monday";	
			break;
				
		case 2:
			dayName="Tuesday";
			break;
			
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			
			default:
				dayName="invalid";
				break;
		}
		System.out.println(dayName);
		}
		
	}

}
