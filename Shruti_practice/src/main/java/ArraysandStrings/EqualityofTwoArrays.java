package ArraysandStrings;

public class EqualityofTwoArrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,3,4,5};
	boolean equalornot=true;
	
	if(a.length==b.length)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				equalornot=false;
			}
		}
	}
	else {
		equalornot=false;
	}
	
	if(equalornot)
	{
		System.out.println("two arrays are equal");
	}
	else
		System.out.println("two arrays are not equal");
}
}
