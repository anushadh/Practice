package problems.algorithms;

import java.util.Arrays;

/*Problem 26:
Given a sorted array nums, remove the duplicates in-place such that each element appear 
only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying 
the input array in-place with O(1) extra memory.*/

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {2,2};
		int length = rd.removeDuplicates(nums);
		System.out.println(length);
		System.out.println(Arrays.toString(nums));
	}
	

	//Modify the array and return the length
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums ==  null) {
        	return 0;
        }
        int length = nums.length;
        int i = 0;
		while((i < length-1)) {
			if(nums[i] == nums[i+1]) {
				//System.out.println(nums[i] + " " + nums[i+1] + " " + i);
				swapElements(nums, i);
				length--;
				i--;
			}
			i++;
		}
		return i+1;
    }
//  && (i+1 < length)
	private void swapElements(int[] nums, int i) {
		for(int j = i; j < nums.length-1; j++) {
			//System.out.println(nums[i] + nums[i+1]);
			nums[j] = nums[j+1];
		}
	}


}
