package problems.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*169. Majority Element
Given an array of size n, find the majority element. The majority element is the element that 
appears more than n/2  times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

public class MajorityElement {

	public static void main(String[] args) {
		MajorityElement me = new MajorityElement();
		int[] nums = {-1,1,1,1,2,1};
		System.out.println(me.majorityElement(nums));
	}

	/*//Sort elements and count
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int k = nums.length/2;
		int count = 1;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				count++;
				if(count > k) return nums[i];
			} else {
				count = 1;
			}
		} 
		return nums[0];
	}*/

	
	//Sort elements and return n/2 th element
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

	//Using extra space
	/*public int majorityElement(int[] nums) {
        int k = nums.length/2;
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(count.containsKey(nums[i])) {
            	int c = count.get(nums[i]);
            	count.put(nums[i], c+1);
            	if(c+1 > k) return nums[i];
            } else {
            	count.put(nums[i], 1);
            }
        } 
        return nums[0];
    }*/

	//Brute Force - without space
	/*public int majorityElement(int[] nums) {
        int k = nums.length/2;
        for(int i : nums) {
        	int count = 0;
        	for(int j : nums) {
                if(i == j) {
                	count++;
                }
            } 
        	if(count > k) {
        		return i;
        	}
        }

        return -1;
    }*/
}
