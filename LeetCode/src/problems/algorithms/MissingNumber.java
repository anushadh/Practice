package problems.algorithms;

import java.util.Arrays;

/*268. Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.*/


public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		int[] array = {1,2,3};
		System.out.println(mn.missingNumber(array));;
	}
	
	public int missingNumber(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		Arrays.sort(nums);
		/*if(nums[0] != 0) return 0;
		int start = 0;
		int end = nums[nums.length-1]-1;
		while(start < end) {
			System.out.println(start + " " + end);
			if(nums[start] != start) return start;
			if(nums[end] != end) return end;
			start++;
			end--;
		}
		return nums[nums.length-1]+1;*/
		int num = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != num) {
				return num;
			}
			num++;
		}
		return num;
    }

}
