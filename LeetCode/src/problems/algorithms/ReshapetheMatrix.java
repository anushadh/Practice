package problems.algorithms;

import java.util.Arrays;

/*566. Reshape the Matrix

In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of 
the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.*/

public class ReshapetheMatrix {

	public static void main(String[] args) {
		ReshapetheMatrix rm = new ReshapetheMatrix();
		int[][] nums = {{1,2,9},
				 {3,4,10},
				 {5,6,11},
				 {7,8,12}};
		int r = 3;
		int c = 4;
		System.out.println(Arrays.deepToString(rm.matrixReshape(nums, r, c)));
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int r1 = nums.length;
		int c1 = nums[0].length;
		if(r1*c1 == r*c) {
			int[][] nums1 = new int[r][c];
			int m = 0, n = 0;
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					nums1[i][j] = nums[m][n];
					n++;
					if(n >= c1) {
						n = 0;
						m++;
					}
				}
			}
			return nums1;
		}
        return nums;
    }
}
