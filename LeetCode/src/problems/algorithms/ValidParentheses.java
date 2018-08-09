/**
 * 
 */
package problems.algorithms;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.*/

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		String s = "{[]}";
		System.out.println(vp.isValid(s));
	}

	public boolean isValid(String s) {
		try {
			if(s == null || s.equals("")) return true;
			while(s.length() > 0) {
				String temp = s;
				s = s.replace("()", "");
				s = s.replace("{}", "");
				s = s.replace("[]", "");
				if(temp.equals(s)) {
					break;
				}
			}
			if(s.length() == 0) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}

}
