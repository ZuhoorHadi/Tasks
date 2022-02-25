package selfPracticeClass03;

public class MethodsPractice {
	
	
	
	
	double checkDiscount (boolean isSaleOn, double origPrice, double discount) {
		if (isSaleOn) {
			return( origPrice-origPrice*discount);
			
		}else {
			return origPrice;
		}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsPractice object=new MethodsPractice();
		System.out.println(object.checkDiscount(false, 100, .15));
		System.out.println(object.checkDiscount(true, 100, .15));

	}

}
