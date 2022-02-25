package homeWork_Methods;

public class Task_4 {
	

	String createEmail(String userName, String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}
	
	public static void main(String[] args) {
		
		Object Task_4=new Object();
		
		Task_4 object=new Task_4();
		
		object.createEmail("John", "snow", "gamil");
		
		System.out.println(object.createEmail("John", "snow", "gamil"));
		
		
		

	}

}
