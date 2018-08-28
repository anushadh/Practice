package problems.algorithms;

import java.util.Arrays;

/*167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add 
up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
		where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.*/

public class TwoSumII {

	public static void main(String[] args) {
		TwoSumII ts = new TwoSumII();
		int[] numbers = {2,7,11,15};
		int target = 13;
		System.out.println(Arrays.toString(ts.twoSum(numbers, target)));
	}
	
	public int[] twoSum(int[] numbers, int target) {
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = numbers.length-1; j >= 0 ; j--) {
				if(numbers[i] + numbers[j] == target) {
					return new int[] {i+1, j+1};
				} 
			}
		}
		return null;
	}
}
