package ArraysandStrings;

public class FindMinAndMaxValue {

	int a[]= {1,5,9,2,7,4};
	int max=0;
	int min;
	public void max() {
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);	
	}
	public void min()
	{
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;k<a.length-1;k++)
			{
				if(a[j]<a[k])
					
					min=a[j];
				a[j]=a[k];
				a[k]=min;
			}
				
				
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
	FindMinAndMaxValue mm = new FindMinAndMaxValue();
	mm.max();
	mm.min();
}
}
