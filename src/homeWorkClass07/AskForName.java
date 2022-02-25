package homeWorkClass07;

import java.util.Scanner;

public class AskForName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name, last name and age");
		String name=scan.nextLine();
		
		System.out.println("Enter your last name");
		String lastname=scan.nextLine();
		int age=scan.nextInt();
		
		
		
		for(int value=5; value>=1; value--) {
			System.out.println("your name is "+name+" your last name is "+lastname+" and age is "+age);
		}
	}

}
