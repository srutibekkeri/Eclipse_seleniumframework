package Binarysearch;

import java.util.Arrays;

public class ArrayRotationEx {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int n=1;
	
	for(int i=0;i<n;i++)
	{
		int last=a[a.length-1];
		for(int j=a.length-1;j>0;j--)
		{
			a[j]=a[j+1];
			
		}
		a[0]=last;
		//System.out.println("Array rotation"+);
	}
	System.out.println();
	
	System.out.println("Array rotation");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
	
}

}

