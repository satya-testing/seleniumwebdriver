package JavaPrograms;

public class CompareCharAt {

	public static void main(String[] args) {
		//write a java code to print true if characters are matching in given 2 strings and print false if characters are not matching
		
		String str1 = "hello";
		String str2 = "welcome";
		
		charMatching(str1 , str2);
	}

	

		
	public static void charMatching(String str1 , String str2)
	{
		if( str1==null || str2==null)
		{
			System.out.println("either of the stirngs are null");
			return ;
			
		}
		
		for(int i=0; i<str1.length(); i++)
		{
			boolean match=str1.charAt(i)==str2.charAt(i);
			System.out.println("char at index- "+i+ "(" +str1.charAt(i)  +  " vs "   +str2.charAt(i) +")" +match);

		}
		
	}	
	}