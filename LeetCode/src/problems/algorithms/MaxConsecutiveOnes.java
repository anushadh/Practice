package problems.algorithms;

/*485. Max Consecutive Ones

Given a binary array, find the maximum number of consecutive 1s in this array.
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
    
    Note:

    	The input array will only contain 0 and 1.
    	The length of input array is a positive integer and will not exceed 10,000
*/
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		MaxConsecutiveOnes mo = new MaxConsecutiveOnes();
		int nums[] = {1, 1, 1, 0, 1, 1};
		System.out.println(mo.findMaxConsecutiveOnes(nums));
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
        	if(i == 1) {
        		count++;
        	} else {
        		max = Math.max(max, count);
        		count = 0;
        	}
        }
        max = Math.max(max, count);
        return max;
    }
}
