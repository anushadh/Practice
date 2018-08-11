package problems.algorithms;

import java.util.Arrays;
/*Problem 66:
	Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

	The digits are stored such that the most significant digit is at the head of the list, and each
	element in the array contain a single digit.

	You may assume the integer does not contain any leading zero, except the number 0 itself.*/
public class PlusOne {

	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int[] digits = {8, 9};
		int[] plusOne = po.plusOne(digits);
		System.out.println(Arrays.toString(plusOne));
	}

	public int[] plusOne(int[] digits) {
		int length = digits.length;
		if(length == 0) {
			return new int[] {1};
		}
		for(int i = length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] newDigits = new int[length+1];
		newDigits[0] = 1;
		return newDigits;
    }

}
