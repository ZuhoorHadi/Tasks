package selfPracticeMethods;

public class CreatePasswordConfirm {
	
	
	String checkUserAndPassword(String userName, String password) { 
		
		if(userName.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
				
		}else if(password.length()==8){
			System.out.println("Password is too short");
		
		}else if(password.contains(userName)) {
			System.out.println("Password cannot contain username");
			
		}else if(password.contentEquals(password)) {
			System.out.println("confirmed");
			
		}else  {
			System.out.println("Passwords do not match");
		}
		return userName + password;

	}
	public static void main(String[] args) {
		
		CreatePasswordConfirm object=new CreatePasswordConfirm();
		
		object.checkUserAndPassword("", "");
		
	}

}
