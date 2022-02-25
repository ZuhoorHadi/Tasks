package comSyntaxClass14;

public class StringMethods_1 {

	public static void main(String[] args) {
		// String Method
		// if there is space between the characters in the data or reading data and we dont want
		// the space in print
		// it doesn't remove the space in-between
		
		String name="            Zuhoor                ";
		
		System.out.println(name);
		
		System.out.println(name.trim());
		
		
		//Starts with the method
		
		String name2="Run donkey"; //

		System.out.println(name.startsWith("run"));
		System.out.println(name2.startsWith("donkey"));
		//method chaining calling multiple methods in the same line.
		

	}

}
