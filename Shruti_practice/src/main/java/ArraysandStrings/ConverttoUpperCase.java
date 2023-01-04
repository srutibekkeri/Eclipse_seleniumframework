package ArraysandStrings;

public class ConverttoUpperCase {
public static void main(String[] args) {
	String b="AaBbCcDD is umbrella";
	//String c = b.replace('a','A');
	//System.out.println(c);
	
String[] d = b.split(" ");
String output = "";
for(int i=0;i<d.length;i++)
{
	String word = d[i];
	if(word.equals("umbrella"))
	{
		word= word.toUpperCase();
		
	}
	output=word;
}
System.out.println(output);
	
}
}
