package problems.algorithms;

import java.util.HashMap;
import java.util.Map.Entry;


/*Problem 242. Valid Anagram
Given two strings s and t , write a function to determine if t is an anagram of s.*/



public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram va = new ValidAnagram();
		String s = "anagram";
		String t = "nagaram";
		System.out.println(va.isAnagram(s, t));;
	}
	
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for(int i : count) {
			if(i != 0) {
				return false;
			}
		}
		return true;
    }
	
	/*public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        int i = 0;
        while(i < s.length()) {
        	if(sArray[i] != tArray[i]) {
        		return false;
        	}
        	i++;
        }
        return Arrays.equals(sArray, tArray);
    }*/
	
	/*public boolean isAnagram(String s, String t) {
	if(s.length() != t.length()) {
		return false;
	}
	if(s.length() == 0) {
		return true;
	}
	HashMap<Character, Integer> hm = new HashMap();
	for(char c : s.toCharArray()) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c) + 1);
		} else {
			hm.put(c, 1);
		}
	}
	for(char c : t.toCharArray()) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c) - 1);
		} 
	}
	for(Entry<Character, Integer> e : hm.entrySet()) {
		if(e.getValue() < 0 || e.getValue() > 0) {
			return false;
		}
	}
	return true;
	}*/
}
