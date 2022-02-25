package com.SyntaxClass12;

public class Horse {
	
	//attributes
	// object ---> includes features and behavior
	
	String name;
	String breed;
	int age;
	double wieght;
	
	//behavior
	
	void run() {
		System.out.println(name+" is running");
	}
	
	
	void eat() {
		System.out.println(name+ "is eating");
	}
	
	
	void printCompleteinfo() {
		System.out.println("name="+name);
		System.out.println("breed="+breed);
		System.out.println("age="+age);
		System.out.println("wieght="+wieght);
	}

	public static void main(String[] args) {
		
		// to use attribute or behavior we need to create the object first
		// name of the class---> the name of the object---.
		
		Horse besh=new Horse();
		besh.name="spirit";
		besh.breed="Stallion";
		besh.age=20;
		besh.wieght=400;
		besh.run();
		
		besh.printCompleteinfo();
		
		System.out.println("*************************");
		
		Horse Jeem=new Horse();
		Jeem.name="Tuzik";
		Jeem.breed="Mastang";
		Jeem.age=15;
		Jeem.wieght=350;
		Jeem.run();
		
		Jeem.printCompleteinfo(); // printCompleteinfo --> prints all the information of the object
	}

}
