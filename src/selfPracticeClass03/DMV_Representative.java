package selfPracticeClass03;

import java.util.Scanner;

public class DMV_Representative {

	public static void main(String[] args) {
		
		Scanner NewIn=new Scanner(System.in);
		System.out.println("What is your age");
		int age=NewIn.nextInt();
		
	
		if(age>=18) {
			System.out.println("I will issue you a driver's license");
		}else {
			System.out.println("I will issue you driver's permit");
		}

	}

}
