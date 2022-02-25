package selfPracticeClass03;

import java.util.Scanner;

public class Credit_Card {


	public static void main(String[] args) {
		
		Scanner CreditCard=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		
		String newInput=CreditCard.next();
		
		Scanner Ques=new Scanner(System.in);
		System.out.println("How much do you have?");
		String Bal=Ques.next();
		
		int balance=900;
		if (balance>=1000) {
			System.out.println("Pay off immediatley");
		}else {
			System.out.println("You can spend more");
		}


	}

}
