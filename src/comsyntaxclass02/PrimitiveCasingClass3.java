package comsyntaxclass02;

public class PrimitiveCasingClass3 {
		
	public static void main(String[] args) {
		
		/*There are two type of casting
		 * 1- Widening/implicit or auto complete-- in this casting method you store
		 * a small value inside big value and therefore it is also called auto complete
		 * the small value automatically could be place inside big value.
		 * Example: If you want place a byte inside a short or a short inside integers or long 
		 * you can do it easily. 
		 */
		

		int i=10;
		double d=(int)10;
		System.out.println(d);
		System.out.println(i);
		
		int num=(int)10.0;
		System.out.println(num);
		
		int num1=(int)10.99f;
		
		System.out.println(num1);
		
		
		
		
		
		
		
	}

}
