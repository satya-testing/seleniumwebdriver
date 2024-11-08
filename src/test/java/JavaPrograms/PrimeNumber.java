package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Natural number >1
		//Which has only 2 factors 1 and itself
		
		int num =73;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num ;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("number is a prime number");
			}
			else {
				System.out.println("not a prime number");
			}
			
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
		
	}

}
