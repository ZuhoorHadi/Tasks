package com.Syntax_09;

public class Arraylesson05_for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for each loop is 
		// if you have an array you canu se for each loop it interate/loop throguh the entire array.
		
		
		// what to specify
		// array is the "cities"
		// for each loop goes in to the each loop. it takes each element and stores in in side cities variable
		// in the first interation it gives the first element name and the second goes back and gives the second 
		// variable name and goes and checks until the condition false.
		// cities here is a collection of names of the cities. 
		
		
		String[]cities= {"Washington DC", "Miami", "Los Angeles", "New Work"};
		
		for (String city:cities) {
			
			System.out.println(city);
		}
		
		
		// whenever there is collection go either for each loop
		// take each number from the array and store it in the for loop
		// identify the data type, then name of the variable,
		//then name of the Array
		//
		
		
		int [] numbers= {10, 20, 30, 40};
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		
		

	}

}
