package problems.algorithms;

import java.util.ArrayList;
import java.util.List;

/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
		Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*
*/

public class Sum3 {

	public static void main(String[] args) {
		Sum3 sum3 = new Sum3();
		int nums[] = {-1, 0, 1, 2, -1, -4};
		System.out.println(sum3.threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> set = new ArrayList<>();
		if(nums.length > 0) {
			for(int i = 0; i < nums.length-2; i++) {
				for(int j = i+1; j < nums.length-1; j++) {
					for(int k = j+1; k < nums.length; k++) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
						if(nums[i] + nums[j] + nums[k] == 0) {
							set.add(nums[i]);
							set.add(nums[j]);
							set.add(nums[k]);
							result.add(set);
							set = new ArrayList<>();
						}
					}
				}
			}
		}
		return result;
    }
	
}