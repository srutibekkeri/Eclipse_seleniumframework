package matrix;

public class additionoftwomatrix {
public static void main(String[] args) {
	int a[][]= {{2,3} ,{4 ,5}, {6,7}};
	int b[][]= {{4,9},{7,5},{9,4}};
	int c[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			c[i][j]=a[i][j]/b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
