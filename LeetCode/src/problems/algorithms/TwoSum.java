package problems.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		TwoSum obj = new TwoSum();
		int[] solution;
		solution = obj.twoSum(nums, target);
		System.out.println(Arrays.toString(solution));
		solution = obj.twoSum2(nums, target);
		System.out.println(Arrays.toString(solution));
	}

	//Approach 1: Brute Force O(N^2)
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No solution");		
	}

	//Using Hashtable to reduce time complexity O(N)
	//Space complexity - O(N)
	public int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap();
		for(int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if(hm.containsKey(diff)) {
				return new int[] {hm.get(diff), i};
 			}
			hm.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution");		
	}
}
