package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuiltInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int arr[]= {3,1,4,2,6};
		
	//	System.out.println(Arrays.toString(arr));	
		
	//	Arrays.sort(arr);
		//or
	//	Arrays.parallelSort(arr);
		
		
	//reverse in decending order
		Integer a[] = {20,40,60,80,10};
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		
	}

}
