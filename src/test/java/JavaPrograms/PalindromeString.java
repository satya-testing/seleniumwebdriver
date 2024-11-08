package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check palindrome");
		String s =sc.next();
		
		String rev = "";
		String orginal = s;
		
		int len =s.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(rev.equals(orginal))
		{
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}

}
