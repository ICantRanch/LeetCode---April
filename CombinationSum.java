package LeetCode.April;

import java.util.Arrays;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(combinationSum4(new int[] {1,2,3},4));
		
	}
	
	public static int combinationSum4(int[] nums, int target) {
		
		int[] totals = new int[target+1];
		Arrays.sort(nums);
        if(nums[0] <= target){
            totals[0] = 1;
        }else{
            return 0;
        }
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]<=target) {
				int max = maxCoins(nums[i],nums,totals);
				//if(max == -1) {totals[nums[i]] = 1;}else {
				totals[nums[i]] = max;
				//}
				
			}
		}
		System.out.println(Arrays.toString(totals));
		int result = maxCoins(target,nums,totals);
		System.out.println(Arrays.toString(totals));
		return result;
	}
	
	public static int maxCoins(int target, int[] nums, int[] totals) {
		
		if(totals[target] > 0 || totals[target] == -1) {
			return totals[target];
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(target >= nums[i]) {
				int max = maxCoins(target-nums[i],nums,totals);
				if(max != -1) {
					totals[target] += max;
				}
			}
		}
		if(totals[target] == 0) {totals[target] = -1;}
		return totals[target];
		
	}

}
