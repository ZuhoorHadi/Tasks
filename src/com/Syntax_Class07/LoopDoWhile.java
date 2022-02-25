package com.Syntax_Class07;

public class LoopDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* do while also do the same repetative 
		 * While (syntax)
		 * while (Condition)
		 * Block Body
		 * The syntax is different the "do while" starts with a do and has a block of code and outside of the {} block cod
		 * we check the condition.
		 * 
		 */

		
		int num=3;
		while(num<=5) {
			System.out.println("Hello");
			num++;		
		}
		
		int num1=3;
		do {
			System.out.println("Hello");
			num1++;
		}while (num1<=3);
			
			
		
		
		int amount=1;
		
		do {
			System.out.print(amount+" ");
			
		}while(amount<=30);
		amount++;
		
		
		int i=2;

		do {
		  System.out.println(i);
		  i+=2;
		}while (i>=2);
 
		
		
	}

}
