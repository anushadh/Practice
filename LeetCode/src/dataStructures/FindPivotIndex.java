package dataStructures;

/*Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal 
to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the 
		left-most pivot index.
		
Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].
		*
		*/


public class FindPivotIndex {

	public static void main(String[] args) {
		FindPivotIndex fpi = new FindPivotIndex();
		int[] nums = {-1,-1,-1,1,1,-1};
		System.out.println(fpi.pivotIndex(nums));
	}
	
	public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;
		for(int i : nums) {
			rSum += i;
		}
		for(int i = 0; i < nums.length; i++) {
			rSum -= nums[i];
			if(lSum == rSum) {
    			return i;
    		}
			lSum += nums[i];
		}
		return -1;
    }
	
	/*public int pivotIndex(int[] nums) {
        if(nums.length > 0) {
        	for(int i = 0; i < nums.length; i++) {
        		int lSum = 0;
        		int rSum = 0;
        		for(int j = i-1; j >= 0; j--) {
        			lSum += nums[j];
        		}
        		for(int j = i+1; j < nums.length; j++) {
        			rSum += nums[j];
        		}
        		//System.out.println(lSum + " " + rSum);
        		if(lSum == rSum) {
        			return i;
        		}
        	}
        }
		return -1;
    }*/
}
