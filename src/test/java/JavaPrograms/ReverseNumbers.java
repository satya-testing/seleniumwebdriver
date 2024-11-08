package JavaPrograms;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers to reverse");
		int num = sc.nextInt();
		
		//1. Using algorithm
/*		int rev =0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num =num/10;
		}
			
		
		//2. Using StringBuffer class
		//convert int num to string
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();
		System.out.println("reversed of given number is :"+rev);
*/	
		//3. Using StringBuilder class

		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		//StringBuilder rev=sb1.reverse();
		//System.out.println("reversed of given number is :"+rev);
		System.out.println(sb1.reverse());

}
}