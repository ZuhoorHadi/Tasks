package selfPracticeClass03;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
	Scanner city=new Scanner(System.in);
	System.out.println("What city do you live?");
	String NewInput=city.next();
	System.out.println(NewInput);
	
	Scanner input4=new Scanner(System.in);
	System.out.println("What is the temprature");
	char input=input4.next().charAt(0);
	System.out.println();
	
	double temprature1=30;
	System.out.println("Enter the temprature1 to convert to celsius");
	Scanner x1=new Scanner(System.in);
	System.out.println();
	temprature1=x1.nextDouble();
	temprature1=((30-32)*5)/9;
	System.out.println("temprature1 in celsius "+temprature1);
	
	System.out.println("The temprature in the city is -1 Celsius");
		
	}
	

}
