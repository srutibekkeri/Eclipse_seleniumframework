package Binarysearch;

import java.util.Arrays;

public class Binarysearching1 {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,80,90};
	int key=800;
	boolean flag=false;
	
	int L=0,H=a.length-1;
//Arrays.binarySearch(a, 80);
while(L<=H)
{
	int M=(L+H)/2;
	if(a[M]==key)
	{
		System.out.println("element found");
		//System.out.println(key);
		flag=true;
		
		
	}
	if(a[M]<key)
	{
		 L=M+1;
	}
	if(a[M]>key)
	{
		H=M-1;
	}
		
	
}
if(flag==false)
{
	System.out.println("element not found");
}
}
}
