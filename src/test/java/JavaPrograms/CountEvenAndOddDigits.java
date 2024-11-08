package JavaPrograms;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =sc.nextInt();
		
		int even = 0;
		int odd =0;
		
		
		while(num>0)
		{
			int last = num%10;
			if(last%2==0)
			{
				even ++;
			}
			else {
				odd ++;
			}
			num =num/10;
		}
		System.out.println("even count"+even);
		System.out.println("odd count"+odd);

	}

}
