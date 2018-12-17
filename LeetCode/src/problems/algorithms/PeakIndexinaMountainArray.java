package problems.algorithms;

/*852. Peak Index in a Mountain Array

Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].*/

public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		int[] A = {0,2,1,0};
		PeakIndexinaMountainArray pima = new PeakIndexinaMountainArray();
		System.out.println(pima.peakIndexInMountainArray(A));
	}
	
	public int peakIndexInMountainArray(int[] A) {
		int index = 0;
		int peak = A[0];
		
		for(int i = 0; i < A.length-1; i++) {
			if(A[i] > A[i+1]) {
				peak = A[i];
				index = i;
				break;
			}
		}
		
		for(int i = index; i < A.length-1; i++) {
			if(A[i] < A[i+1]) {
				break;
			}
		}
		
		return peak;
    }

}
