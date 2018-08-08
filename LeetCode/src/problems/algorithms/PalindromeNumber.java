package problems.algorithms;

/*Problem 9:
 * 
Determine whether an integer is a palindrome. An integer is a 
palindrome when it reads the same backward as forward.*/

public class PalindromeNumber {

	public static void main(String args[]) {
		PalindromeNumber pn = new PalindromeNumber();
		int x = 10;
		System.out.println(pn.isPalindrome(x));
	}

	/*//O(N)
	public boolean isPalindrome(int x) {
		if(x == 0) return true;
		if(x < 0) return false;
		String s = Integer.toString(x);
		StringBuffer sb = new StringBuffer();
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		if((long) x == Long.parseLong(sb.toString())) {
			return true;
		}
		return false;
	}*/
	
	/*//O(N)
	public boolean isPalindrome(int x) {
		if(x == 0) return true;
		if(x < 0) return false;
		String s = Integer.toString(x);
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
		}
		
		return true;
	}*/

	//O(Log N)
	public boolean isPalindrome(int x) {
		if(x == 0) return true;
		if(x < 0) return false;
		long reverse = 0;
		int temp = x;
		while(temp != 0) {
			int rem = temp % 10;
			temp = temp / 10;
			reverse = (reverse * 10) + rem;
		}
		if(x == reverse) {	
			return true;
		}
		return false;
	}
}
