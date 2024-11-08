package JavaPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int range =sc.nextInt();
		
		int sum =0;
		
		for(int i=1; i<=range ;i++)
		{
			sum = sum+ i;
			
		}
		System.out.println("Total sum is :"+sum);
	}

}
