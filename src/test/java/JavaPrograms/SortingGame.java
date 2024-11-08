package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SortingGame {

	public static void main(String[] args) {
		
		String[] a = {"apple","cat","apple","ball", "cat","apple"};
		int len = a.length;
		//ArrayList<String> list = new ArrayList<String>();
		
		//ArrayList<String> alist = new ArrayList<>(Arrays.asList(a));
		
		//System.out.println(alist.get(0));
		//System.out.println(alist.size());
		
		for(int i=0; i<=len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]);
				}
			}
		}
	}

}
