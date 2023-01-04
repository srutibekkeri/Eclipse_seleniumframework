package ArraysandStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovefirstandLastStringfromArray {

public static void main(String[] args) {
	String[] a= {"tree","leaf","fruit","buds"};
	ArrayList al = new ArrayList();
	for(Object ff:a)
	{
		al.add(ff);
		
	}
	System.out.println(al.toString());
	al.remove(0);
	System.out.println(al.toString());
	al.remove(al.size()-1);
	System.out.println(al);
	
}
}