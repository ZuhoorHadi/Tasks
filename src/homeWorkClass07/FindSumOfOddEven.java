package homeWorkClass07;

public class FindSumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find the sum of all even and odd number form the range 1-50
		
		// Step by step
		// first find the sum of 1-50
		
		
		
		int sumEvn=0;
		int sumOdd=0;
		
	for (int i=1; i<=50; i++){
		
		if (i % 2==0) {
			sumEvn=sumEvn+i;
		}else {
			
			sumOdd=sumOdd+i;
		}
			
		
		
			System.out.print("The sum of all even number ="+sumEvn+" and the sum of all odd numbers ="+sumOdd);
		}
	
	
	
	
	}

}
