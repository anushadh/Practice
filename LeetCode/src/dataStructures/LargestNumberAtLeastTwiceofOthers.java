package dataStructures;

/*In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.*/

public class LargestNumberAtLeastTwiceofOthers {

	public static void main(String[] args) {
		LargestNumberAtLeastTwiceofOthers lnlto = new LargestNumberAtLeastTwiceofOthers();
		int[] nums = {0,0,1,2};
		System.out.println(lnlto.dominantIndex(nums));
	}
	
	public int dominantIndex(int[] nums) {
		if(nums.length == 0) return -1;
		if(nums.length == 1) return 0;
		int max = Integer.MIN_VALUE, index = -1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != max && (2*nums[i] > max)) {
				System.out.println(max + " " + nums[i]);
				return -1;
			}
		}
		return index;
	}
	
	/*public int dominantIndex(int[] nums) {
		if(nums.length == 0) return -1;
		if(nums.length == 1) return 0;
		int max = Integer.MIN_VALUE, index = 0, max2 = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max2 = max;
				max = nums[i];
				index = i;
			}
			if(nums[i] > max2 && nums[i] != max) {
				max2 = nums[i];
			}
		}
		System.out.println(max + " " + max2);
		if(max >= 2*max2) return index;
		return -1;
	}*/
}
