package comsyntaxclass02;

public class ClassThreeIfConditionClass {

	public static void main(String[] args) {
		String dayTime="morning";
		String month="January";
		int date=22;
		
		// Today is morning of January 22.
	
		String sentence="Today is  "+dayTime+" "+"  of "+" "+month+" "+date;
		System.out.println(sentence);
		
		int num=100;
		int num1=500;
		if(num>num1) 
		{
		System.out.println(num>num1);
		System.out.println(num+" is greather than "+num1);
		
		}else 
		{
			System.out.println(num1+ " is greather than "+num);
			
		int Value1=50;
		int value2=45;
		
		if(Value1>value2) {
		System.out.println(Value1+" is greather than "+value2);
		}else 
		{
			System.out.println(value2+" is greath than "+Value1);
		}
		}
		
		String Day="Holiday";
		String Day1="workDay";
		if(Day==Day1) {
			System.out.println(Day+" I will stay home");
		}else 
		{
			System.out.println(Day1+" I go to the office.");
		}
		
		int temp=45;
		if(temp>45){
		System.out.println(temp+" I am going for a walk");
		}else {
			System.out.println("I am staying home");
		}
			
		char gender='F';
		if(gender=='F') {
			
			System.out.println(gender+" Please use the front of the train");
			
		}else {
			System.out.println("Please use back of the train");
		}
		
		
		int money=5;
		int coffee=(int)4.5;
		
		if(money>coffee) {
			System.out.println("I buy a cup of coffee");
		}else {
			System.out.println("I will drink a cup of team instead");
			}
			
			int money1=5;
			int coffee1=5;
			if(money1>=coffee1) {
				System.out.println(" I also buy a cup of coffe");
			}else 
			{
				System.out.println("I will drink a cup of tea instead");}
		}

	}
