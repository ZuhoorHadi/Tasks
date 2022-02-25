package comSyntaxClass13;

public class MethodsDemo3 {
	
	void checkperson(String name) {
		if ("Zuhoor".equalsIgnoreCase(name)) {
			System.out.println("He is a gent");
		}else {
			System.out.println("I dont know");
		}
		
		System.out.println("Zuhoor");
	}
	
	
	

	public static void main(String[] args) {
		
		MethodsDemo3 object=new MethodsDemo3();
		object.checkperson("Zuhoor");

	}

}
