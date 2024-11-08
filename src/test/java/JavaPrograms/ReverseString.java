package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String s = sc.next();
		
	// 1.Using stringBuilder class
/*		StringBuilder sb1 = new StringBuilder();
		System.out.println("reverse of a given string is :"+sb1.append(s).reverse());
*/		
	// 2. Using StirngBuffer class
/*		StringBuffer sb = new StringBuffer(s);
		System.out.println("reverse of a given string is :"+sb.reverse());
*/
		
	// 3.Using 	concatination operator charAt
/*		String rev = "";
		int len =s.length();  //ABCD //length =4
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("reverse of a given string is :"+rev);
*/		
	// 4.Using charecter array
		//conver the string to char array
		char a[] = s.toCharArray();
		String rev ="";
		//length of char array
		int len =a.length;
		for(int i=len-1; i>=0;i--)
		{
			rev = rev + a[i];
		}
		System.out.println("reverse of a given string is :"+rev);
	}

}
