package JavaPrograms;

public class CountCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count how many times a is occurred
		String s = "satyanarayana reddy P";
		
		int a =s.length(); //total length
		int b=s.replaceAll("a","").length(); //length after removing a's
		
		int count = a-b;
		System.out.println(" Number of times a occurred in a string :"+count);  //6
	}

}
