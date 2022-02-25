package selfPracticeClass03;

import java.util.Scanner;

public class LoanSpecialist_2 {

	public static void main(String[] args) {
		
		Scanner Input=new Scanner(System.in);
		System.out.println("How much loan do you need?");
		String loan=Input.next();
		
		int loanrequested=500000;
		
		if(loanrequested<=200000) {
			System.out.println("The request for the loan will be approved ");
			
		}else {
			System.out.println("The request for the loan will be denied");
		}

	}

}
