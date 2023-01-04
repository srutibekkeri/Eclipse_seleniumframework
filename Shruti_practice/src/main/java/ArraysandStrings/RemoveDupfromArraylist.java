package ArraysandStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDupfromArraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(7);
		al.add("ss");
		al.add('d');
		al.add(7);
		System.out.println(al);
		
		
		HashSet ts = new HashSet(al);
		System.out.println(ts);
	}

}
