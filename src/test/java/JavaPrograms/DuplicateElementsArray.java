package JavaPrograms;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a[]= {1,2,3,4,2,5,7,5}
		String arr[]= {"satya", "reddy", "satya", "Apple"};
		
		boolean flag = false ;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("found duplicate element :"+arr[i]);
					flag = true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
		
	}

}
