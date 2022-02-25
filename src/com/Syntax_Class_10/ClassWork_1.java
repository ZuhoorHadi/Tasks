package com.Syntax_Class_10;

public class ClassWork_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss 
		 * and  Smith, Jordan, Jackson, Obama.
		*After storing values print following String:
		*Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		*
		 */
		
		
		String[][]values= {
				
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},	
				
		};
		
			System.out.println(values[0][1]+" "+values[1][0]);
			System.out.println(values[0][0]+" "+values[1][3]);
			System.out.println(values[0][2]+" "+values[1][2]);
			System.out.println(values[0][3]+" "+values[1][1]);

			System.out.println("___________________________Another___________________");

			String[][]names=new String[2][4];
				names[0][0]="Mr";
				names[0][1]="Mrs";
				names[0][2]="Ms";
				names[0][3]="Miss";
				
				names[1][0]="Smith";
				names[1][1]="Smith";

				names[1][2]="Smith";

				names[1][3]="Smith";
				
				
				System.out.println(values[0][1]+" "+values[1][0]);
				System.out.println(values[0][0]+" "+values[1][3]);
				System.out.println(values[0][2]+" "+values[1][2]);
				System.out.println(values[0][3]+" "+values[1][1]);
				
				

				

				
						
						
						
						
	}

}
