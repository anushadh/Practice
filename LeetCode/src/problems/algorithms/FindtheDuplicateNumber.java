package problems.algorithms;

import java.util.Arrays;
import java.util.HashSet;

/*287. Find the Duplicate Number

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at 
least one duplicate number must exist. 
Assume that there is only one duplicate number, find the duplicate one.

Note:

You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.*/

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		FindtheDuplicateNumber fdn = new FindtheDuplicateNumber();
		int[] nums = {1,3,4,2,2};
		System.out.println(fdn.findDuplicate(nums));
	}
	
	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++) {
        	if(nums[i] == nums[i+1]) return nums[i];
        }
        
        return -1;
    }
	/*//Using a hash set
	public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i : nums) {v
        	if(hs.contains(i)) return i;
        	else hs.add(i);
        }
        
        return -1;
    }
*/}