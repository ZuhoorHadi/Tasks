package homeWork_Methods;

public class Task_1 {

	/*1.	Create a method that will take 2 parameters as a numbers and prints which number is larger.
	 */
	
	void checkNumber(int number1, int number2) {

		if(number1>number2) {
			System.out.println(number1+ " is larger");
			
	}else if(number2>number1){
			
			System.out.println(number2+" is larger");
	}else{
		}System.out.println(" the numbers are equal");
	
	}
		
		
			
		
	public static void main(String[]args) {
		
		Task_1 object=new Task_1();
		
		object.checkNumber(20, 50);
		
	}

}
