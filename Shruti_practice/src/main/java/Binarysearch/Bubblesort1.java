package Binarysearch;

import java.util.Arrays;

public class Bubblesort1 {
	public static void main(String[] args) {
		int a[]= {5,3,1,2,4};
		System.out.println("Arrays before sorting"+Arrays.toString(a));
		
		int n=a.length-1;
		for(int i=0;i<n;i++)   //no of passes
		{
			for(int j=0;j<n;j++)   //iteration in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];    //swapping using temp
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting"+Arrays.toString(a));
	}


}
