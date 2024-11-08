package JavaPrograms;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
			
	//	i>i+1 then swap
		 int a[]= {4,2,1,5,3};
		System.out.println("Before sorting :"+ Arrays.toString(a));
		int n = a.length;
			
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=a[j];
				}
			}
		}
		System.out.println("after bubble sort :"+ Arrays.toString(a));
		
	}

}
