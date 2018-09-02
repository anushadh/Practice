package problems.algorithms;

/*An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for
all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.
*/
public class MonotonicArray {

	public static void main(String[] args) {
		MonotonicArray ma = new MonotonicArray();
		int[] A = {1,1,1};
		System.out.println(ma.isMonotonic(A));
	}
	
	public boolean isMonotonic(int[] A) {
		boolean flag1 = true;
		boolean flag2 = true;
		for(int i = 0; i < A.length-1; i++) {
			//System.out.println(A[i+1] + " " + A[i]);
			if(A[i+1] < A[i]) {
				flag1 = false;
			}
			if(!(A[i] >= A[i+1])) {
				flag2 = false;
			}
		}
		if(flag1 || flag2) {
			return true;
		}
        return false;
    }

}
