package problems.algorithms;

import java.util.Arrays;

/*283. Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while 
maintaining the relative order of the non-zero elements.

Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.*/

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes mz = new MoveZeroes();
		int[] nums = {0,0,1, 0, 1};
		mz.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public void moveZeroes(int[] nums) {
        if(nums.length > 0) {
       
        	int index = 0;
        	for(int i = 0; i < nums.length && index < nums.length; i++) {
        		if(nums[i] != 0) {
        			nums[index] = nums[i];
        			index++;
        		}
        	}
        	for(int i = index; i < nums.length; i++) {
        		nums[i] = 0;
        	}
        	
        	
        	/*int count = nums.length;
        	for(int i = 0 ; i < nums.length; i++) {
        		if(count == i) break;
        		if(nums[i] == 0) {
        			for(int j = i; j < nums.length-1; j++) {
        				nums[j] = nums[j+1];
        			}
        			nums[nums.length-1] = 0;
        			i--;
        			count--;
        		}
        	}*/
        }
    }

}