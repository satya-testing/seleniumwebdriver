package JavaPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "satya narayana reddy";
		String[] eachWord = s.split(" ");
		String reversedString ="";
		
		for(  String w : eachWord)
		{
			String  reverseWord = "";                        
			for(int i=w.length()-1; i>=0; i--)                 //using stringBuilder also we can achive
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			reversedString = reversedString+reverseWord+" ";
		}
		System.out.println(reversedString);
	}

}
