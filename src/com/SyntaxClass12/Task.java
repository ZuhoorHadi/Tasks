package com.SyntaxClass12;

public class Task {
	
	
	String iphone;
	String color;
	String type;
	int model;
	double wieght;

	void dial(){
	
	System.out.println("dial a number");
	}
	
	void pressKey() {
		System.out.println("Press Ok key to answer the call");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with
		// specific attributes and behaviors.
		// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,Labrador
		// with specific attributes and behaviors.
			
		
		Phone iphone=new Phone();
		
		iphone.dial();
		
		
		
	}

}
