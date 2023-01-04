package ArraysandStrings;

public class SeperatingalpanumbersEx {
public static void main(String[] args) {
	String a="selenium123$";
	char[] achar = a.toCharArray();
	String alp="";
	String num="";
	String spl="";
	for(int i=0;i<achar.length;i++)
	{
		char x = achar[i];
		if(Character.isDigit(x))
		{
			num=num+x;
		}
		else if(Character.isAlphabetic(x))
		{
			alp=alp+x;
		}
		else {
			spl=spl+x;
		}
	}
	System.out.println("digits are    "+num);
	System.out.println("alphabets are   "+alp);
	System.out.println("spcial characters    "+spl);
}
}
