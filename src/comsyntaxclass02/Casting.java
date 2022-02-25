package comsyntaxclass02;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=500;
		num=num+200;
		System.out.println(num);
		
		num -=60;
		System.out.println(num);
		
		int cakePiece=11;
			cakePiece/=4;
			System.out.println(cakePiece);
		
		 int cake=25;
		 	cake%=7;
		 	
		 	System.out.println(cake);
		 	
		 	// casting happens when we convert data from one type to another type of data
		 	// there are two types of casting
		 	//1- widening/implicit/automatic where I store small data into bigger data variable
		 	//2- Narrowing/explicit or manually where I store big data into smaller data here 
		 	//we will have some error from the java but we will do it manually
	
	int d=10;
	System.out.println(d);
	double d1 =(int)10.99;
	System.out.println(d1);
	
	int a=(int)9.99;
	System.out.println(a);
	
	double Jb=(float)40;
	
	System.out.println(Jb);
	
	byte k1=(short)66.99;
	
System.out.println(k1);
	
	
	int num4=(int)22222222999l;
	System.out.println(num4);
	

	}

}
