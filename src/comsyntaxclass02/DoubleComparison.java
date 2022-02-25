package comsyntaxclass02;

public class DoubleComparison {

	public static void main(String[] args) {
		
		double num=50;
		double num1=30;
		if(num>num1) {
			System.out.println("print");
			
		} else 
		{
			System.out.println("print");
		}
		
	/* define a variable to store a 
	 * 
	 * if browser is Chrome--->we are executing the tests in Chrome
	 * otherwise---> i am not executing any test on Chrome
	 * 
	 */

		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("we are executing test on chrome");
		}else {
			System.out.println("we are not executing the test");
		}
		
		
		String Name="Zuhoor";
		if (Name.equals("Zuhoor")){
			System.out.println("I will lend you the money");
		}else {
			System.out.println("I will ask for further varification");
		}
		
		String TVShow="Shabaka";
		if(TVShow.equals("Shaam")) {
			System.out.println("I watching it tonight");	
		}else {
			System.out.println("I will turn off the TV and will study.");
		}
			
		
	}

}
