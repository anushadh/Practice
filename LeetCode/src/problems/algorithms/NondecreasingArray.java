package problems.algorithms;

public class NondecreasingArray {

	public static void main(String[] args) {
		
		NondecreasingArray nda = new NondecreasingArray();
		int[] nums = {5, 4, 3};
		System.out.println(nda.checkPossibility(nums));

	}
	
	public boolean checkPossibility(int[] nums) {
		if(nums == null || nums.length == 0) return true;
		int count = 0;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] > nums[i+1]) {
				count++;
			}
			if(count > 1) return false;
		}
		return true;
        
    }
}
