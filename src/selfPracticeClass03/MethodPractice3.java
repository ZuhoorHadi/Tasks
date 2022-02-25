package selfPracticeClass03;

public class MethodPractice3 {
	
	
	String getProperAnimalByExpert (String expertName, String animalName) {
		
		if("Tyfure".equalsIgnoreCase(expertName) && "Horse".equalsIgnoreCase(animalName)){
			return "camel";
					
		}else 
			if("Horse".equals(animalName)){
				return "Horse";
				
			}else {
				return "I don't know";
			}
		
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodPractice3 object=new MethodPractice3();
		object.getProperAnimalByExpert("camel","Horse");
		System.out.println(object.getProperAnimalByExpert("Tefure", "Horse"));
		System.out.println(object.getProperAnimalByExpert("Tef", "Horse"));


		
		
	}	

}
