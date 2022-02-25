package com.Syntax_09;

public class ArraysIntro {

	public static void main(String[] args) {
		/*What is arrays?
		 * it is sequence of value or variable values which holds number of value
		 * it stores multiple values
		 * 
		 * "int" can hold only one variable at a time, but later on can change
		 * 
		 * to find the average of different value of the data...for example finding the average of multiple
		 * variables...instead we can use arrays to hold all of the values in one place
		 * To find a container to place 100 of variables in the same container and we can do that 
		 * with help of arrays 
		 * array is specified by using square int[]number;;; collection of all variables in once place 
		 * for example we have 90, 80, 70, 100>>> we can put all these numbers in once place we can create 
		 * arrays.
		 * the data stores in arrays based on the indexes....index starts with [0] and goes on 
		 * after the values stored in the arrays specify the size...how many values inside the array
		 * each value is known as element.
		 * the first element is 90 the second element is 80
		 * the first element stored with index (0) and the second stored with index (1)
		 * as soon as the array created specify the number of elements 
		 * 
		 */
		
		int numb=1;
		
		// create an array which holds 4 elements
		int[]numbers=new int[4];
		
		//storing values/elements inside an array
		
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		// I want to print "99"

		
		System.out.println(numbers[3]);
		
		System.out.println(numbers[3]+numbers[0]);
		
		
		// create an array of the countries 
		// first create type of data which String
		// then create the arrays with []
		// adding new value that is not in the array may not be printed and the error will be printed
		// indicating there is error in the line where it was not in the list. 
		
		String []countries=new String[5];
		
		countries[0]="USA";
		countries[1]="Canda";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		//countries [5]="Turkey"; this element because was not in the array element...
		// but here is the print statement.... still will give error
		
		//System.out.println(countries[5]);
		
		System.out.println(countries[3]+countries[4]);
		
		
		// what if I start from 1
		// java will print the element
		//but what if we also add zero with printing (0)
		// The index starts from Zero(0) compile adds the default value of that same type of data....the default value 
		// for the String is "null"
		// I can change the variable by assigning the new value to it. 
		
		String [] names=new String [5];
		
		names [1]="Abdul";
		names [2]="Zuhoor";
		names [3]="Hadi";
		
		System.out.println(names[0]);
		
		
		
	}

}
