package LeetCode.April;

public class NonDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPossibility(new int[] {1,2,4,5,3}));
	}
	
	public static boolean checkPossibility(int[] nums) {
		boolean increase = false;
		for(int i = 1;i < nums.length;i++){
			if(nums[i] < nums[i-1]){

				System.out.println(i);
				
				if(i < 2){
					increase = true;
				}else{
					if(i == nums.length-1){
						if(!increase){
							increase = true;
						}else{
							return false;
						} 
					}else{

						if(nums[i] >= nums[i-2] || nums[i+1] >= nums[i-1]){
							if(!increase){
								increase = true;
							}else{
								return false;
							}  
						}else{
							return false;
						}
					}  
				}



			}
		}
		return true;
	}

}
