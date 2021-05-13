package LeetCode.April;

import java.util.Arrays;

public class BeautifulArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructArray(2,1);
	}

	public static int[] constructArray(int n, int k) {

		int difference = n-1;
		int[] result = new int[n];
		result[0] = 1;
		boolean plus = true;

		for (int i = 1; i < k; i++) {
			result[i] = result[i-1] + (plus?difference:-difference);
			difference--;
			plus = !plus;
		}
		System.out.println(Arrays.toString(result));
		if(plus) {
			difference = 1;
		}else {difference = -1;}
		for (int i = k; i < result.length; i++) {
			result[i] = result[i-1] + difference;
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
