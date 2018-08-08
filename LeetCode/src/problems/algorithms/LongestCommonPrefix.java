package problems.algorithms;

import java.util.Arrays;

/*Problem 14:
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		//String[] strs = {"flower","flow","flight"};
		String[] strs = {};
		System.out.println(lcp.longestCommonPrefix(strs));
	}

	/*public String longestCommonPrefix(String[] strs) {
		StringBuffer sFinal = new StringBuffer();
		try {
			String s = strs[0];
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				boolean cNotExists = false;
				for(int j = 0; j < strs.length; j++) {
					if(!(strs[j].charAt(i) == c)) {
						cNotExists = true;
						break;
					}
				}
				if(!cNotExists) {
					sFinal.append(c);
				} else {
					break;
				}
			}
		} catch(Exception e) {
			return sFinal.toString();
		}
		return sFinal.toString();
	}*/
	
	public String longestCommonPrefix(String[] strs) {
		String sFinal = "";
		try {
			sFinal = strs[0];
			for(int i = 0; i < strs.length; i++) {
				while(strs[i].indexOf(sFinal) != 0) {
					sFinal = sFinal.substring(0, sFinal.length()-1);
				}
			}
		} catch(Exception e) {
			return sFinal;
		}
		return sFinal;
	}
}
