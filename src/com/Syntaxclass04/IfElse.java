package com.Syntaxclass04;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;
		if (month == 1) {
			System.out.println("January");

		}

// nested if-if inside another if

		// if the statement is false the execution is not applicable we do not have
		// permission
		// to execute the operation. Only the "if" true there is operation possible
		// we need nest if--> when there is need for the further check.

		boolean vaccine = true;
		int doese = 1;
		
		if (vaccine){
			System.out.println("you need another shot");	
			
			if(doese==1) {System.out.println("you need another shot");
			}
		} 
		else
		{
				System.out.println("you are fully vaccinated");
			}
		
		// declare a variable for allergy
		// if you have allergy-->
		//							if you have pollen
		//							if you have peanut
		//							if you have wheat
		
		// if no allergy ---> you are luck!
		
		boolean allergy=true;
		
		if(allergy) {
			
			System.out.println("Lets check what allergies you have");
			
			String typeallergy="polen";
			
			if(typeallergy.equals("allergy")){
				System.out.println("Pleae stay home");{
					
					}
				}else if(typeallergy.equals("peanut")) {
					System.out.println("Pleae do not eat nuts");{
						
					}
				}else if(typeallergy.equals("glutten")) {
					System.out.println("Pleae follow glutten free diet");
					
				}
					
			}else 
				{
				System.out.println("Ther is not prescription for you");
				}
			
		}

}
