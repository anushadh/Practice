package problems.algorithms;

import java.util.Arrays;

/*905. Sort Array By Parity

Given an array A of non-negative integers, return an array consisting of all the even 
		elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.*/

public class SortArrayByParity {

	public static void main(String[] args) {
		SortArrayByParity sap = new SortArrayByParity();
		int[] A = {1, 2, 4, 6};
		System.out.println(Arrays.toString(sap.sortArrayByParity(A)));
	}
	
	public int[] sortArrayByParity(int[] A) {
        int n = 0;
        int count = A.length-1;
        while(n < count) {
            if(A[n] % 2 != 0) {
                swapElements(n, A);
               n--;
               count--;
            }
            n++;
        }
        return A;
    }

	private void swapElements(int n, int[] a) {
		int temp = a[n];
		for(int i = n; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = temp;
	}
}