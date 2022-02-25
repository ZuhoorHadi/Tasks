package comSyntaxClass13;

public class MethodDemo1 {
	
	// void is a type of method which doesn't return anything we can give code and logic, but doesnt return when called
	// Void creates methods for us.
	// checkEvenOdd is a method.
	// Void takes logic from outside 
	//
	
	
	public static void checkPrime(int number) {
	}
	
	void checkEvenOdd(int number) {
		
		if (number%2==0) {
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}
		
		
		
		
		
	
	}
	
 public static	void checkWeather(boolean isRaining) {
		
		if(isRaining) {
			System.out.println("I am staying home");
			
		}else {
			System.out.println("Lets go for a walk");
		}
	}
	
	
	public static void checkPerson(String name) {
		if ("Zuhoor".equals(name))
			
		System.out.println("memes");
		
		else if("Maha".equals(name)) {
			System.out.println("Doctor");
			
			
		}else {
			System.out.println("Unknown");
		}
	}
	

	public static void main(String[] args) {
		
		MethodDemo1 object1=new MethodDemo1();
		
		object1.checkEvenOdd(120);
		
		object1.checkPerson("Zuhoor");

	}

}
