package com.SyntaxClass06;

public class SwitchClassSession06 {

	public static void main(String[] args) {
	
		char choice='y';
		String answer;
		
		switch (choice) {
		
		case 'y':
			answer="Yes";
			break;
			
		case 'n':
			answer="No";
			break;
			
		case 'm':
			answer="Maybe";
			break;
			
			default:
				answer="Unknown";
				break;
		}
		System.out.println(answer);
	}

}
