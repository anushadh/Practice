package problems.algorithms;

import java.util.Arrays;

/*561. Array Partition I
Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].

Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).*/

public class ArrayPartitionI {

	public static void main(String[] args) {
		ArrayPartitionI api = new ArrayPartitionI();
		int[] nums = {5,4,3,2};
		System.out.println(api.arrayPairSum(nums));
	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int i = 0; i < nums.length; i = i+2) {
        	sum += nums[i];
        }
        return (int)sum;
    }

}