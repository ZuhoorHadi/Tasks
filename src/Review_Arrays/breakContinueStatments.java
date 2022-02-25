package Review_Arrays;

public class breakContinueStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Break and Continue loops
		 * block of codes "{}"
		 * break in a switch statement jumps out of that block 
		 * break in for loop also jumps from one code of blocks to another code of block
		 * break uses with if statement without if the compilation may not make sense
		 * 
		 * Why use break?
		 * 
		 * Continue loop:: the behavior of continue is also the same behave it ignores all the codes after
		 * "continue, but make the statement based on if condition. 
		 * 
		 */
		
		int x=0;
		while(x<5) {
			
			if (x==3) {
				break;
			}
			System.out.println("1");
			 x++;
		}
		
		for (int y=0; y<5; y++) {
			
			if (y<3) {
				continue;
			}
		System.out.println("2");
		}
	// continue request java to ignore whatever comes after "continue"
		//Why use continue:::  if a certain condition is met it skips the code written below continue that is ignore and 
		// will go back to the first or main code. 

	}

}
