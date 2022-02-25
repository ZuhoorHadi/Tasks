package com.SyntaxClass12;

public class Dog {
	
	// define the class above or outside of the main method
	// I created a class for the dog
	// 1- Create attributes first... they are also called fields, properties.
	// below are the attributes/fields/properties....how should look the software...

	String name;
	String color;
	String breed;
	char gender;
	int age;
	double wieght;

	// to add behavior/functions/methods to the attribute use "void"
	// defining means creating, give input

	void bark() {
		System.out.println("Dog is barking");
	}

	void eat() {
		System.out.println("Do is eating");
	}

	void sleep() {
		System.out.println("Do is sleeping");
	}

	// creating scan=new scanner (System.in)

	public static void main(String[] args) {

		Dog scooby = new Dog();

		// name of the class--->value name and -->"new" again class name-->same like scanner class
		// calling the object refers to ask for output
		// Dog is class
		// scooby is called object, function,
		// = is an assignment operator
		// new is a keyword the we use to create the object of the class
		// Dog() we are calling the constructor of the class
		//

		scooby.bark();
		scooby.eat();
		scooby.sleep();
	}

}
