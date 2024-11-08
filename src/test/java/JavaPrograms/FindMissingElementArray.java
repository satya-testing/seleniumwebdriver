package JavaPrograms;

public class FindMissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5,6,7,8} ;
		
		int sum1=0;
		for(int i=0; i<a.length ; i++)
		{
			sum1 = sum1+a[i];
			
		}
		System.out.println("Sum of the given array is :"+sum1);
		
		int sum2=0;
		for(int i=1;i<8;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Total sum is :"+sum2);
		
		System.out.println("Missing element in a array is :"+(sum1-sum2));
	}

}
