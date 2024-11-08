 package JavaPrograms;

public class MaxandMinElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {50,60,30,100};
		int max =a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element in a array is :"+max);
		
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min =a[i];
			}
		}
		System.out.println("Min element in a array is :"+min);
	}

}
