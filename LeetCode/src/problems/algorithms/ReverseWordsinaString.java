package problems.algorithms;

import java.util.Arrays;

/*
151. Reverse Words in a String
Given an input string, reverse the string word by word.
*/

public class ReverseWordsinaString {

	public static void main(String[] args) {
		ReverseWordsinaString rws = new ReverseWordsinaString();
		String s = "    the sk +y a  is    blue     ";
		System.out.println("**" + rws.reverseWords(s) + "**");
	}
	
	public String reverseWords(String s) {
		if(s == null || s.equals("") || s.length() == 0) return "";
		s = s.trim();
		String[] sArray = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = sArray.length-1; i >= 0; i--) {
			sb.append(sArray[i]);
			if(i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
    }
}
