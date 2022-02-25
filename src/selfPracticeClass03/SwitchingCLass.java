package selfPracticeClass03;

import java.util.Scanner;

public class SwitchingCLass {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Start day of the week by starting Monday as 0 and Saturday as 1");
		int day=input.nextInt();
		
		switch(day) {
		case 1:System.out.println(" The day of the week is monday");
			break;
		
		case 2: System.out.println("the day of the week is tuseday");
				break;
		
		case 3: System.out.println("the day of the week is wednesday");
		
		
		}
				
		
		
		
	}

}
