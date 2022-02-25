package selfPracticeClass03;

import java.util.Scanner;

public class DMVRepresentative {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your age,please?");
		int age=input.nextInt();
		
		
		if (age>=18) {
			System.out.println("I will issue a driver's license for you");
		}else {
			System.out.println("I will issue a driver's permit for 60 days for you");
		}
		
		

	}

}
