package LeetCode.April;

import java.util.Arrays;

public class OnesAndZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findMaxForm(new String[] {"10","0001","111001","1","0"},3,2);
		
		
	}

	public static int findMaxForm(String[] strs, int m, int n) {

		double zPoint = 1/(double)m;
		double oPoint = 1/(double)n;
		
		double[] points = new double[strs.length];
		
		for (int i = 0; i < strs.length; i++) {
			points[i] = zPoint*strs[i].replaceAll("1","").length() + oPoint*strs[i].replaceAll("0", "").length();
		}
		Arrays.sort(points);
		System.out.println(Arrays.toString(points));
		return n;
		
		//I think i'm on the right track, see if implementing a queue to only update point[i] if a lower updated on hasn't been found
		
		//try to find max amount of 1's without exceeding 0's (and vice versa) then return the max
		
	}
}
