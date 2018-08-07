package problems.algorithms;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
	
	public static void main(String args[]) {
		LongestSubstring ls = new LongestSubstring();
		String s = " ";
		int length = ls.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	public int lengthOfLongestSubstring(String s) {
		//HashMap<Character, Integer> hm = new HashMap();
		HashSet<Character> hs = new HashSet();
		int length = 0;
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(i + " -- " + c);
			if(hs.contains(c)) {
				System.out.println("Present " + c);
				if(length > max) {
					max = length;
				}
				i = i - 1;
				length = 0;
				hs.clear();
			} else {
				length++;
				hs.add(c);
			}
		}
		return max;
	}

}
