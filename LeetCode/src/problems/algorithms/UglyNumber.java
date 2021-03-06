package problems.algorithms;


/*263. Ugly Number

Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
*/
public class UglyNumber {

	public static void main(String[] args) {
		UglyNumber un = new UglyNumber();
		int num = 555;
		System.out.println(un.isUgly(num));
	}
	
	public boolean isUgly(int num) {
        if(num == 1) return true;
        if(num < 1) return false;
        boolean flag = true;
        while(flag) {
        	flag = false;
        	if(num % 2 == 0) {
        		num /= 2;
        		flag = true;
        	} 
        	if (num % 3 == 0) {
        		num /= 3;
        		flag = true;
        	} 
        	if (num % 5 == 0) {
        		num /= 5;
        		flag = true;
        	}
        }
        if(num == 1) return true;
        return false;
    }
}
