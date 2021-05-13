package LeetCode.April;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
		Queue<Integer> largest = new PriorityQueue<>();
		int sum = 0;
		int i;
		for(i = 1; i < heights.length;i++){

			int jump = heights[i]-heights[i-1];
			if(jump > 0){
				if(jump > largest.peek()) {
					if(largest.size() == ladders) {sum += largest.poll();}
					largest.add(jump);
				}else {
					sum += jump;
				}
				if(sum > bricks) {
					i--;
					break;
				}
			}
		}
        return i;
    }

}
