package com.Syntax_Class_10;

public class Class_10_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of countries. while retrieving all values from an array print
		//capital for each country.
		// here  use the switch case
		
		String[]countries= {"Poland", "Germany", "Ukraine", "Russia"," UK"};
		
		String capital=null;
		
			for (int i=0; i<countries.length; i++) {
				
				switch (countries[i]) {
				
				case "Poland":
				capital="Worsa";
				break;
				
				case "Germany":
					capital="Berline";
					break;
					
				case "Ukraine":
					capital="Moscow";
					break;
				case "Russia":
					capital="Moscow";
					break;
					
				case "UK":
					capital="London";

					
					break;
					
				}
				
				System.out.println("The capital of the country is "+capital);

			}
				
			
			
			// Another Way.....................
			
			System.out.println("_______________________________________________");
			
			for (String country:countries) {
				
				if(country.equals("poland")) {
					capital="worsa";
					
					
				}else if (country.equals("Germanu")) {
					capital="Berline";
					
					
				}else if (country.equals("Ukraine")) {
					capital="Moscow";
					
					
				}else if (country.equals("UK")){
					capital="London";
				}
				
				System.out.println("The capital of "+country+" is "+capital);
				
			}
			

		
	}

}
