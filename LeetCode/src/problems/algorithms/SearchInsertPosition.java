package problems.algorithms;

/*
35. Search Insert Position
Given a sorted array and a target value, return the index if the target is found. 
		If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.*/


public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums = {};
		int target = 2;
		System.out.println(sip.searchInsert(nums, target));
	}
	
	public int searchInsert(int[] nums, int target) {
		try {
			if(nums == null || nums.length == 0) {
				return 0;
			}
			int i = 0;
			while(i < nums.length) {
				if(target <= nums[i]) {
					return i;
				}
				i++;
			}
			return i;
		} catch(Exception e) {
			return 0;
		}
    }
}
