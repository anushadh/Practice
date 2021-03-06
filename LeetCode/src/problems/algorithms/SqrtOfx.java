package problems.algorithms;

/*69. Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the 
		integer part of the result is returned.
		
		*
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.*/

public class SqrtOfx {

	public static void main(String[] args) {
		SqrtOfx sqx = new SqrtOfx();
		int x = 2147483647;
		System.out.println(sqx.mySqrt(x));
	}
	
	public int mySqrt(int x) {
		int mid = (x/2)+1;
        for(int i = 0; i <= 46341; i++) {
        	System.out.println(i + " " + (i*i));
        	if(i*i == x) {
        		return i;
        	}
        	else if(i*i > x) {
        		return i-1;
        	}
        	
        }
		return -1;
		
    }
}	
