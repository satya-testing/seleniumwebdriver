package JavaPrograms;

public class RemoveJunkSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "??!@####;@*&@^^😀😁😂😂🤣🤣 satya narayana reddy";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
