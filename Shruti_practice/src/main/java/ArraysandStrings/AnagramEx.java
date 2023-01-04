package ArraysandStrings;

import java.util.Arrays;

public class AnagramEx {
	public static void main(String[] args) {
		String s="keep";
		String t="peekaa";
		
		char[] s1 = s.toLowerCase().toCharArray();
		char[] t1 = t.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		
		boolean d1 = Arrays.equals(s1, t1);
		if(d1)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
		
		
	}

}
