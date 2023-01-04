package ArraysandStrings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovedupfromString {
public static void main(String[] args) {
	String s="sstri";
	char[] cchar = s.toCharArray();
	LinkedHashSet <Character>hs = new LinkedHashSet<Character>();
	for(char dd:cchar)
	{
		hs.add(dd);
		
	}
	
	System.out.println(hs.toString());
}
}
