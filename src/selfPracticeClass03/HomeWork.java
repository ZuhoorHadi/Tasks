package selfPracticeClass03;

public class HomeWork {
	
	/*1.	Create a method that will take 2 parameters as a numbers and prints which number is larger.
	 */
	
	static void checkNumber(int number1, int number2) {

		if(number1>number2) {
			System.out.println(number1+ " is larger");
			
	}else{
		System.out.println(number2+" is larger");
		
		}
			
		}
	public static void main(String[]args) {
		checkNumber(20,50);
		
	}
}
