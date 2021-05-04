package LeetCode.April;

import java.util.Arrays;
import java.util.Comparator;

public class AlienDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAlienSorted(new String[] {"donald","duck","bugs","buckets","buck"},"worldabcefghijkmnpqstuvxyz");
		
		
	}
	
	
	public static boolean isAlienSorted(String[] words, String order) {

		
		
		
		
		String[] temp = Arrays.copyOf(words, words.length);
		
		Arrays.sort(temp, new Comparator<String>() {
			
			public int compare(String a, String b) {
				
				for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
					
					if(a.charAt(i) != b.charAt(i)) {
						
						System.out.printf("A: %s, B: %s\n",a,b);
						
						return order.indexOf(a.charAt(i)) - order.indexOf(b.charAt(i));
					}				
				}
				
				return a.length() - b.length();
				
			}
			
		});
		
		System.out.println(Arrays.toString(temp));
		
		return Arrays.equals(words, temp);
		
		
	}

}
