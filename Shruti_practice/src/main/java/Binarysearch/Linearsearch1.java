package Binarysearch;

public class Linearsearch1 {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,80,90};
	int key=800;
	
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			System.out.println("element found");
			flag=true;
		}
	}
	if(flag==false)
	System.out.println("element not found");
}
}
