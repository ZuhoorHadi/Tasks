package replitTaskJan30;

import java.util.Scanner;

public class AddAgeBy10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java program to demonstrate switch case
		// with primitive(int) data type

		int day = 5;
		String dayString;

		// switch statement with int data type
		switch (day) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
		}
		System.out.println(dayString);
	}

}
