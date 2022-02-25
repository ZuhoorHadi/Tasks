package quizNumberOne;

public class QuestionNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//What will be the output of the following program?
		
		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;

        if(a < b) {
             System.out.println("A is less than B");
         }

        if(a==b) {

             System.out.println("A is equal to B");
        }

       if(a > b) {
             System.out.println("A is greater than B");
        }
	}

}
