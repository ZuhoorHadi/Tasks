package homeWork_Methods;

public class Task3HomeWork {
	
	 String sayHello(String country) {
		
		switch(country) {
		
		case "USA":
			return "Hello";
			
		case "Frence":
			return "Bonjour";
			
		case " Trukey":
			return "Marhaba";
			
		default: 
			return "None";
		}
	}


	public static void main(String[] args) {
		
		Task3HomeWork object=new Task3HomeWork();
		
		String country=object.sayHello("USA");
		System.out.println(country);
		
	}

}
