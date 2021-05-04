package LeetCode.April;

import java.util.regex.Pattern;

public class StringHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		halvesAreAlike("TextBook");
	}

	public static boolean halvesAreAlike(String s) {
		
		String a = s.substring(0, s.length()/2);
		String b = s.substring(s.length()/2);
		
		Pattern pattern = Pattern.compile("[^aeiouAEIOU]");
		b = pattern.matcher(b).replaceAll("");
		a = pattern.matcher(a).replaceAll("");
		
		return a.length() == b.length();
	}
}
