package JavaPrograms;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5; //factorial of 5
				
			int factorial =1;
			
			for(int i=1 ; i<=num ; i++)
			{
				factorial = factorial * i;
			}
			System.out.println("factorial of a given number is :"+factorial);
	}

}
