package Review_Arrays;

public class Practice2 {

	public static void main(String[] args) {
		// outer loop controls the rows
		// inner loop controls the column
		// there are 4 rows and 5 columns
		
		for (int i=1; i<=5; i++) {
			System.out.print("*");
			
		}

		System.out.println("______________________________________________________");
		
		for (int row=1; row<=4;row++) {
			
				for (int col=1; col<=5; col++) {
				
				System.out.print("* ");
				
			
				}
		}
			System.out.println();

		
	}

}
