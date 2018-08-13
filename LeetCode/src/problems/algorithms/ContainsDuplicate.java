package problems.algorithms;

import java.util.Arrays;
import java.util.HashSet;

/*217. Contains Duplicate
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, 
		and it should return false if every element is distinct.

*/public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate cd = new ContainsDuplicate();
		int[] nums = {0, 1};
		System.out.println(cd.containsDuplicate(nums));
	}
	
	 public boolean containsDuplicate(int[] nums) {
	     if(nums == null || nums.length < 2) {
	    	 return false;
	     }
	     Arrays.sort(nums);
		 for(int i = 0; i < nums.length; i++) {
			 for(int j = i+1; j < nums.length; j++) {
				 if(nums[i] == nums[j]) {
					 return true;
				 }
			 }
		 }
	     return false;
	     /*//O(N)
	     HashSet<Integer> hs = new HashSet<Integer>();
	     for(int i : nums) {
	    	 hs.add(i);
	     }
	     boolean result = hs.size() != nums.length ? true : false;
	     return result;*/
	 }
}
