package com.SyntaxClass12;

public class Robot {
	
	String firstName;
	String lastName;
	int age;
	double hiegth;
	String gender;
	boolean status;
	
	void run() {
		System.out.println(firstName+ "can run");
	}
	
	void speak() {
		System.out.println(firstName+"can speak");
		
	}
	void prinCompleteInfor() {
		System.out.println("Name "+ firstName);
		System.out.println("lastName "+lastName);
		System.out.println("age "+ age);
		System.out.println("gender "+gender);
		System.out.println(firstName+" can run");
		System.out.println(firstName+" can speak");

		
		
	}
	
	public static void main(String[] args) {
		
		Robot Sim=new Robot();
		
		Sim.firstName="Sim";
		Sim.lastName="Sakhi";
		Sim.age=30;
		Sim.gender="male";
		Sim.status=true;
		
		Sim.prinCompleteInfor();
	
		
	
	}

}
