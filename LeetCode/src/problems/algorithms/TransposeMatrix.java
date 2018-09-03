package problems.algorithms;

import java.util.Arrays;

/*Problem: 867. Transpose Matrix
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, 
switching the row and column indices of the matrix.*/

public class TransposeMatrix {

	public static void main(String[] args) {
		TransposeMatrix tm = new TransposeMatrix();
		int[][] A = {{1}, {3}};
		System.out.println(Arrays.deepToString(tm.transpose(A)));
	}
	
	public int[][] transpose(int[][] A) {
        int[][] transpose = new int[A[0].length][A.length];
        for(int i = 0; i < A[0].length; i++) {
        	for(int j = 0; j < A.length; j++) {
        		transpose[i][j] = A[j][i];
        	}
        }
        return transpose;
    }
}
