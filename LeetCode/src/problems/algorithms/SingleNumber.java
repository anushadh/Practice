package problems.algorithms;

import java.util.Arrays;

/*136. Single Number
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

public class SingleNumber {

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] nums = {1, 1, 0, 0, 55, 6, 77};
		System.out.println(sn.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {
		int length = nums.length;
		if(length == 0 || nums == null) {
			return 0;
		}
		Arrays.sort(nums);
		for(int i = 0; i < length-1; i++) {
			if((i == 0) && (nums[i] != nums[i+1])) {
				return nums[0];
			} else if((i == 0) && (nums[i] == nums[i+1])) {
				continue;
			}
			if((nums[i-1] != nums[i]) && (nums[i] != nums[i+1])) {
				return nums[i];
			}
		}
		return nums[length-1];
	}
}