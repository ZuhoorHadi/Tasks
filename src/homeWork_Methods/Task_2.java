package homeWork_Methods;

public class Task_2 {
	
	
	/*
	 * 2.	Create a method that will take a number and prints whether the number is even or odd.
	 */

	static void  checkNumber(int number1) {
		if (number1%2==0) {
			System.out.println(number1+" is even");
		}else {
			System.out.println(number1+" is odd");
			
		}
		
	}
		
	public static void main(String[] args) {
		checkNumber(73);

	}

}
