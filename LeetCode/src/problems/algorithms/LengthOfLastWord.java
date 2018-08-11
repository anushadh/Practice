package problems.algorithms;

/*Problem 58:
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.*/

public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord lw = new LengthOfLastWord();
		String s = "a    ";
		System.out.println(lw.lengthOfLastWord(s));
	}

	public int lengthOfLastWord(String s) {
		s = s.trim();
		int count = 0;
		if(s.length() == 0 || s == "" || s == null) {
			return count;
		}
		try {
			for(int i = s.length()-1; i >= 0; i--) {
				if(s.charAt(i) == ' ') {
					break;
				} 
				count++;
			}
		} catch(Exception e) {
			return 0;
		}
		return count;
	}
}
