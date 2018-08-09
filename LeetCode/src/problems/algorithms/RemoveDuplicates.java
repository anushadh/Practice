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
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int length = rd.removeDuplicates(nums);
		System.out.println(length);
		System.out.println(Arrays.toString(nums));
	}
	
	//This gives only length of distinct values in sorted array
	/*public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums ==  null) {
        	return 0;
        }
		int length = 1, temp = nums[0];
		try {
        	for(int i : nums) {
        		if(temp != i) {
        			length++;
        		} 
        		temp = i;
        	}
        }catch(Exception e) {
        	return 0;
        }
		return length;
    }*/
	
	//Modify the array and return the length
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums ==  null) {
        	return 0;
        }
		int length = 1, temp = nums[0];
		//int firstValue = temp;
		try {
        	for(int i = 1; i < nums.length-1; i++) {
        		System.out.println("Value in array : " + nums[i]);
        		if(temp != nums[i]) {
        			System.out.println("Doesn't Repeat" + nums[i]);
        			temp = nums[i];

        		} else {
        			//push the elements to remove duplicates
        			if(temp == nums[nums.length - 1]) {
        				break;
        			}
        			modifyArray(nums, i);
        			i = i - 1;
        			temp = nums[i];
        			System.out.println("Repeats");
        		}
        		
        	}
        }catch(Exception e) {
        	return 0;
        }
		return length;
    }

	private void modifyArray(int[] nums, int index) {
		for(int i = index; i < nums.length - 1; i++) {
			nums[i] = nums[i+1];
		}
		//nums[nums.length-1] = firstValue;
	}

}
