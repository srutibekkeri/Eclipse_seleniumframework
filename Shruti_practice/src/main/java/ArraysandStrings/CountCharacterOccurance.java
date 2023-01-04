package ArraysandStrings;

public class CountCharacterOccurance {
public static void main(String[] args) {
	String s="java";
	int totallength = s.length();
	String countas = s.replaceAll("a", "");
	
	int count1 = countas.length();
	int ans = totallength-count1;
	System.out.println(ans);
}
}
