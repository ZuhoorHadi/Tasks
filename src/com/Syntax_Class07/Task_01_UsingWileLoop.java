package com.Syntax_Class07;

public class Task_01_UsingWileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TASK

		int d = 2;

		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}

//Another way
/* in the below example increment didn't happen due to the false statement in "if"
 * the condition is true because d<=30)
 * "int" while loop we start from the "while" if the condition is true, then what we want to print, System.out.print
 * then do the increment by variable d++.
 */

		int e = 1;

		while (d <= 30) {

			if (e % 2 == 0) {
				System.out.print(e + " ");
				e++;
				
			}											
		
		}

	}

}
