package problems.algorithms;

/*152. Maximum Product Subarray
Given an integer array nums, find the contiguous subarray within 
an array (containing at least one number) which has the largest product.*/

public class MaximumProductSubarray {

	public static void main(String[] args) {
		MaximumProductSubarray mps = new MaximumProductSubarray();
		int[] nums = {-2};
		System.out.println(mps.maxProduct(nums));
	}
	
	public int maxProduct(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			int prod = nums[i];
			max = Math.max(prod, max);
			for(int j = i + 1; j < nums.length; j++) {
				prod *= nums[j];
				max = Math.max(prod, max);
			}
		}
		return max;
    }
}
