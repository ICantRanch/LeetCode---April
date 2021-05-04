package LeetCode.April;

public class LongestParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses(")()())"));
	}

	public static int longestValidParentheses(String s) {
		
		int max = 0;
		int sum = 0;
		boolean prev = false; //true = '(', false = ')'
		
		for (int i = 0; i < s.length(); i++) {
			
			if(prev) {
				if(s.charAt(i) == ')') {
					sum++;
					if(sum > max) {max = sum;}
					prev = false;
				}else {
					sum = 0;
					prev = false;
				}
			}else {
				if(s.charAt(i) == '(') {
					sum++;
					if(sum > max) {max = sum;}
					prev = true;
				}else {
					sum = 0;
					prev = false;
				}
			}
		}
		
		return max;
	}
}
