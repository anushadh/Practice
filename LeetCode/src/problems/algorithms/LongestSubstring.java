package problems.algorithms;

import java.util.HashSet;

public class LongestSubstring {
	
	public static void main(String args[]) {
		LongestSubstring ls = new LongestSubstring();
		String s = "dvdf";
		int length = ls.lengthOfLongestSubstring(s);
		System.out.println(length);
		length = ls.lengthOfLongestSubstring2(s);
		System.out.println(length);
	}

	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet<>();
		int length = 0;
		int max = 0;
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(hs.contains(c)) {
				max = Math.max(max, length);
				i = index++; //all substrings not covered
				length = 0;
				hs.clear();
			} else {
				length++;
				max = Math.max(max, length);
				hs.add(c);
			}
		}
		return max;
	}
	
	public int lengthOfLongestSubstring2(String s) {
		boolean[] chars = new boolean[128];
		int length = 0;
		int max = 0;
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(chars[c]) {
				max = Math.max(max, length);
				i = index++; //all substrings not covered
				length = 0;
				chars = new boolean[128];
			} else {
				chars[c] = true;
				length++;
				max = Math.max(max, length);
			}
		}
		return max;
	}


}
