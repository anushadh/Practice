package problems.algorithms;
//Problem 7:

/*Given a 32-bit signed integer, reverse digits of an integer.*/

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		int x = 214748365;
		int reverseInt = reverseInteger.reverse(x);
		System.out.println(reverseInt);
	}

	/*//O(N)
	public int reverse(int x) {
		try {
			if(x == 0) {
				return 0;
			}
			String s = Integer.toString(x);
			StringBuffer newS = new StringBuffer();
			if(x > 0) {
				for(int i = s.length()-1; i >= 0; i--) {
					newS.append(s.charAt(i));
				}
				if(Long.parseLong(newS.toString()) > Integer.MAX_VALUE) {
					return 0;
				} else {
					return Integer.parseInt(newS.toString());
				}
			} else {
				for(int i = s.length()-1; i > 0; i--) {
					newS.append(s.charAt(i));
				}
				if(Long.parseLong(newS.toString()) > Integer.MAX_VALUE) {
					return 0;
				} else {
					return -(Integer.parseInt(newS.toString()));
				}
			} 
		} catch(NumberFormatException e) {
			return 0;
		}
	}*/
	//O(Log N)
	public int reverse(int x) {
		int reverse = 0;
		try {
			while(x != 0) {
				int rem = x%10;
				x /= 10;
				if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE && rem > 7)) return 0;
				if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE && rem < -8)) return 0;
				reverse = (reverse * 10) + rem; 
			}
			return reverse;

		} catch(NumberFormatException e) {
			return 0;
		}
	}
	/*2,147,483,647
	-2,147,483,648*/
}