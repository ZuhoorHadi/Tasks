package comSyntaxClass13;

public class MethodsDemo4 {
	
	
	// when we call we can get the result and store the result.
			// multiply the number and returns to the result
			//in this example se the data type
			// whenever this method is called it will give back the in-type data it will be in number tpye or 
			// it will be in the int data-type 
			// here will have the return key word. 
			// the return
			// (int number) is called the paramters of the method
			// return tells java what to return from this method. 
			//
	
	int squareThenumber(int number) {
		return number*number;
		
	}
	

	public static void main(String[] args) {
		
		MethodsDemo4 object=new MethodsDemo4();
		
		int result=	object.squareThenumber(5);
			
			System.out.println(result);
		

	}

}
