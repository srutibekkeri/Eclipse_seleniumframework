package ArraysandStrings;

public class palindromeEx {
public static void main(String[] args) {
	String a="12211";
	String rev="";
	char[] bchar = a.toCharArray();
	
	for(int i=bchar.length-1;i>=0;i--)
	{
		rev=rev+bchar[i];
		
	}
	System.out.println(rev);
	if(a.equals(rev))
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
}
}
