package homeWork_Methods;

public class Task_5 {
	boolean isPrime(int num) {

		boolean isPrime=true;
		
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {}
				break;
			}
				
		
			
		} else {
			isPrime=false;
		}
		return isPrime;

	}
	
	

	public static void main(String[] args) {
		
		Task_5 object=new Task_5();
		object.isPrime(12);
		System.out.println(object.isPrime(12));
	}

}
