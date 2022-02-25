package com.Syntax_09;

public class HomeWork_2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if you want to find the size of array use ------------> int size: []
		// if you want to check the repetition of each value use for loop
		// for (data type valueName and colon ":"then array[]
		
		String[]animal=new String[5];
		
		animal[0]="sheep";
		animal[1]="cow";
		animal[2]="goat";
		animal[3]="horse";
		animal[4]="cat";
		
		for (String type:animal) {
			System.out.println(type);
		}
		
		System.out.println("_________________________________Next__________________________________________");
		
		String[]animals= {"sheep", "cow", "goat", "horse", "cat" };
		
		for (String tpyes:animals) {
			System.out.println(tpyes);
		}
		
		



	}

}
