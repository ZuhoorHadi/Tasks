package homeWork_Methods;

public class Task6 {
	
	
	char getGrade(int score) {
	if	(score > 90) {
		return 'A';
	}
		
	else if	(score > 80) {
		return 'B';
	}
	
	else if	(score > 70) {
		return 'C';
	}
	else if	(score > 60) {
		return 'D';
	}
	
	else {
		System.out.println();
	}
	return 0;
	

	}

	public static void main(String[] args) {
		
		Task_5 object=new Task_5();
		

	}

}
