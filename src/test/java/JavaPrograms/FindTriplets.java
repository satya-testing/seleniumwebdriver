package JavaPrograms;

public class FindTriplets {
	
	static boolean find3numbers(int arr[], int sum )
	{	
		int n = arr.length;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n; k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
						System.out.println("the below numbers are Triplets :"+arr[i]+"," +arr[j]+"," +arr[k]);
						
				//	return true;
				}
			}
		}
	
		return false;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,4,45,6,10,8};
		int sum = 22;
		int m = arr.length;
		System.out.println(m);
		find3numbers(arr,sum);
	}

}
