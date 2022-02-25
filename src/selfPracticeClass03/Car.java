package selfPracticeClass03;

public class Car {
	
	
	String carColor;
	 int carYear;
	 String carMake;
	 
	 void black() {
		 System.out.println("car is black");
	 }
	 
	 
	 void carYear2019() {
		 System.out.println("car model is 2019");
	 }
	 
	 void carMake() {
		 System.out.println("car make is BMW");
	 }
	 
	 void printCompleteinfor() {
		 System.out.println(carMake+carMake);
		 System.out.println(carYear+carYear);
		 System.out.println(carMake+carMake);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car BMW=new Car();
		BMW.black();
		BMW.carYear2019();
		BMW.carMake();
		
		
		System.out.println("__________________________________");
		
		
		
		
		Car Tyota=new Car();
		
		Tyota.carColor="whitle";
		Tyota.carYear=2018;
		Tyota.carMake="Tyota";
		
		
		Tyota.printCompleteinfor();
	
	}

}
