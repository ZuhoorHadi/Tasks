package selfPracticeClass03;

import java.util.Scanner;

public class WorkHrs {

	public static void main(String[] args) {
		
		Scanner WY=new Scanner(System.in);
		System.out.println("How many years have worked with us?");
					int newIn=WY.nextInt();
					
		Scanner annumSal=new Scanner(System.in);
		System.out.println("What is your salary per annum?");
		int newInput=annumSal.nextInt();

		
		int workingYear=3;
		int salary=40000;
		if(workingYear>=5) {
			System.out.println("You are eligible for the bonus");
		}else {
			System.out.println("You are not eligible for the bonus");			
		}
		
		if (salary>=50000) {
			System.out.println("the bonus is 5000");
		} else {
			System.out.println("the bonus is 3000");
		}
		
		// there comparison among more than two numbers
	
		
	}

}
