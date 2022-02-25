package come.SyntaxClass08;

public class NestedLoop {

	public static void main(String[] args) {
	
		
	
		for (int i=1; i>=3; i++) {
			
			System.out.println("Hello"+i);
			
			
		}
		
		System.out.println("Multiplication Table");
		
		/* 3 x1 =3
		 * 3 x2 =6
		 * 3 x3 =9
		 * 3 x10=30
		 * 
		 * when the multiplication happens the variable changes only
		 * 
		 */
		
		int num=3;
		int result;
		
		for (int i=1; i<=10; i++ ) {
			
			result=num*i;
			
			System.out.println(num+" x "+i +"=" +result);
			
		}
		
		System.out.println("---what is the output-");
		
		for (int i=0; 1<=10; i+=3) {
			
			System.out.println(i+" ");
		}
	}

}
