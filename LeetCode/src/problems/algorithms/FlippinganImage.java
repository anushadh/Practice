package problems.algorithms;

import java.util.Arrays;

/*Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] 
horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, 
inverting [0, 1, 1] results in [1, 0, 0]

*Notes:

1 <= A.length = A[0].length <= 20
0 <= A[i][j] <= 1
*/

public class FlippinganImage {

	public static void main(String[] args) {
		FlippinganImage fi = new FlippinganImage();
		int[][] A = {{1,0,0}};
		System.out.println(Arrays.deepToString(fi.flipAndInvertImage(A)));
	}
	
	public int[][] flipAndInvertImage(int[][] A) {
        
		for(int i = 0; i < A.length; i++) {
			int start = 0;
	        int end = A[i].length-1;
        	while(start < end) {
        		int temp = A[i][end];
        		if(A[i][start] == 0) {
        			A[i][end] = 1;
        		} else {
        			A[i][end] = 0;
        		}
        		if(temp == 0) {
        			A[i][start] = 1;
        		} else {
        			A[i][start] = 0;
        		}
        		start++;
        		end--;
        	}
        	if(start == end) {
    			if(A[i][start] == 0) {
        			A[i][start] = 1;
        		} else {
        			A[i][start] = 0;
        		}
    		}
        }
		return A;
    }
}
