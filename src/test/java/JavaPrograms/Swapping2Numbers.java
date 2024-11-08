package JavaPrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
				
	//1.using 3rd variable
	/*	int c=a;
		a=b;
		b=c;	
		System.out.println("a="+a);
		System.out.println("b="+b);
	*/	
	//2.without using 3rd variable and use add & sub
	/*	a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	*/	
	//3.using multiplicaiton and division operator
	/*	a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	*/	
	//4.using single expresion
		
		b=a+b-(a=b);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}

}
