package LeetCode.April;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BrickInTheWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(leastBricks(Arrays.asList(Arrays.asList(1000000001),Arrays.asList(1000000001),Arrays.asList(1000000001))));
		
	}
	public static int leastBricks(List<List<Integer>> wall) {

		int sum = 0;
		for (Integer i : wall.get(0)) {
			sum += i;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		int prev;
		int max = 0;
		
		for (List<Integer> list : wall) {
			prev = 0;
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) + prev);
				prev = list.get(i);
                if(prev == sum){continue;}
                
                if(map.containsKey(prev)){
                	map.put(prev,map.get(prev)+1);
                }else {
                	map.put(prev, 1);
                }
				if(map.get(prev) > max) {
                    max = map.get(prev);
                    System.out.println(prev);
                }
			}
		}
		System.out.println(max);
		return wall.size() - max;
	}

}
