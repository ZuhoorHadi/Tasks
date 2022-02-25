package come.SyntaxClass08;

public class NestLoop08 {

	public static void main(String[] args) {
		// Nested Loop
		/*
		 * the inner loop depends on the outer loop
		 * the outer loop condition must be true to execute
		 * Step1: the for loop outer prints
		 * step2 the inner loop prints
		 * step3: the iterations goes back and checks
		 * The inner loop controls the number
		 * 
		 */

		
		for (int i=1; 1<=3; i++) {
			System.out.print("I am i loop"+i);
			
			
		 	for (int j=1; j<=2; j++) {
				System.out.println("i am nested loop in class"+j);
			}
		}
		
	}

}
