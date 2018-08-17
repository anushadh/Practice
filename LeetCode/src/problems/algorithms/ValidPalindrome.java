package problems.algorithms;

import java.util.Arrays;

/*125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.*/
public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		String s = "A man      b";
		System.out.println(vp.isPalindrome(s));
	}
	
	/*public boolean isPalindrome(String s) {
        if(s == "" || s.length() == 0 || s.trim() == "") return true;
        
        String[] array = s.trim().split("\\s*\\W\\s*");
        StringBuffer sb = new StringBuffer();
        for(String sub : array) {
        	sb.append(sub);
        }
       // System.out.println(sb.reverse().toString());
        return (sb.toString().equalsIgnoreCase(sb.reverse().toString())); 
    }*/

}
