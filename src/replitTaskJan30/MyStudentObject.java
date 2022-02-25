package replitTaskJan30;

public class MyStudentObject {

	public static void main(String[] args) {

		Student myStudent=new Student();
		
		myStudent.name="Abdul";
		myStudent.lastName="Hadi";
		myStudent.gpa=3.6;
		myStudent.age=30;
		myStudent.onProbation=true;
		myStudent.major="Computer Science";
		
		System.out.print(myStudent.name+" "+myStudent.age);
				
				
	}

}
