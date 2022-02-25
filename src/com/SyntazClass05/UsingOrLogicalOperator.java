package com.SyntazClass05;

import java.util.Scanner;

public class UsingOrLogicalOperator {

	public static void main(String[] args) {
		
		String Day="Saturday";
		if (Day.equals("Saturday") ||Day.equals("Sunay")) {
			System.out.println("I have java class");
		}
		System.out.println(" End of the Code");
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the day?");
		String day=input.next();
		
		String day2="Saturday";
		if (day2.equals("Monday") ||day2.equals("Friday")) {
			System.out.println(" There is no class");
			
		}else 
			if(day2.equals("Tuesday") || day2.equals("Wednesday")) {
			System.out.println("There is Manual Testing");
			
		}else if(day2.equals("Thursday")) {
		System.out.println(" It is review class");
		
		}else if(day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("It is Java Class");
		}
			
		
	}

}
