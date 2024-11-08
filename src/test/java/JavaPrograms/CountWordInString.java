package JavaPrograms;

public class CountWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "satya narayana reddy P";
		
		int count =1;
		
		for(int i=0; i<s.length()-1 ;i++)
		{
			if( (s.charAt(i)==' ')  &&  (s.charAt(i+1)!=' ')) //i+1 after space there should not be empty
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
