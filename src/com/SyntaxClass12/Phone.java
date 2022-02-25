package com.SyntaxClass12;

public class Phone {
	
	
	
	String iphone;
	String color;
	String model;
	int noOfCam;
	double screenSize;

	void dial(){
	
	System.out.println("dial a number");
	}
	
	void pressKey() {
		System.out.println("Press Ok key to answer the call");
	}
	
	void turnOn() {
		System.out.println("Turn on butto");
	}
		
	void makeCall() {
		System.out.println("Make a call");
	}
	
	
	void printCompleteinfo() {
		System.out.println("name="+iphone);
		System.out.println("model"+model);
	}
	public static void main(String[] args) {

		
	

	
			Phone iphone=new Phone();
			
			iphone.dial();
			iphone.pressKey();
			iphone.turnOn();
			
			
			System.out.println("_____________________________");
			

			Phone Pixel=new Phone();
			
			Pixel.dial();
			Pixel.pressKey();
			Pixel.turnOn();
			

			Pixel.printCompleteinfo();
			
			System.out.println("_________________________");
			
			Phone nokia=new Phone();
			
			nokia.dial();
			nokia.pressKey();
			nokia.turnOn();
	}

}
