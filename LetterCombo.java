package LeetCode.April;

import java.util.ArrayList;
import java.util.List;

public class LetterCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		letterCombinations("243");
		
	}
	
	static String[][] chars = new String[][] {{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
	
	
	public static List<String> letterCombinations(String digits) {

		List<String> result = new ArrayList<>();
		
		
		addLetter(0,"",digits,result);
		
		System.out.println(result);
		
		return result;
	}
	
	public static void addLetter(int level, String str, String digits, List<String> result) {
		
		String[] temp = chars[Character.getNumericValue(digits.charAt(level)-2)];
		
		for (int i = 0; i < temp.length; i++) {
			
			System.out.println(str + temp[i]);
			if(level + 1 < digits.length()) {
				addLetter(level+1, str + temp[i], digits, result);
			}else {
				result.add(str + temp[i]);
			}		
		}
	}
}
