package JavaPrograms;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6} ;
		int even =0;
		int odd =0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even++;
				System.out.println("even number"+a[i]);
			}
			else
			{
				odd++;
				System.out.println("Odd number"+a[i]);
			}
		}
		System.out.println("number of even :"+even);
		System.out.println("number of odd :"+odd);
	}

}
