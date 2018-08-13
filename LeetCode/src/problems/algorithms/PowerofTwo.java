package problems.algorithms;
/*
Problem 231: 
	Given an integer, write a function to determine if it is a power of two.*/
public class PowerofTwo {

	public static void main(String[] args) {
		PowerofTwo pt = new PowerofTwo();
		int n = 33;
		System.out.println(pt.isPowerOfTwo(n));
	}
	
    public boolean isPowerOfTwo(int n) {
    	if(n == 1) {
    		return true;
    	}
    	if(n == 0) {
    		return false;
    	}
    	int rem = 0;
    	while(n != 1) {
    		rem = n%2;
    		n = n/2;
    		if(rem != 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
