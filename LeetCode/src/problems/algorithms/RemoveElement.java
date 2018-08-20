package problems.algorithms;

import java.util.Arrays;

/*27. Remove Element
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place
with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		int[] nums = {3,2,2,2,3};
		int val = 3;
		System.out.println(re.removeElement(nums, val));
		System.out.println(Arrays.toString(nums));
	}

	public int removeElement(int[] nums, int val) {
		int count = nums.length;
		for(int i = 0; i < nums.length; i++) {
			if(i == count) {
				return i;
			}
			if(nums[i] == val) {
				//System.out.println(nums[i] + " " + val + " " + i);
				swapElements(nums, val, i);
				count--;
				i--;
				//System.out.println(Arrays.toString(nums));
				//System.out.println(count);
			}
		}
		return count;
	}

	private void swapElements(int[] nums, int val, int i) {
		for(int j = i; j < nums.length-1; j++) {
			nums[j] = nums[j+1];
		}
		nums[nums.length-1] = val;
	}
}
