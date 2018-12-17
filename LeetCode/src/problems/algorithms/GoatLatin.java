package problems.algorithms;

import java.util.Arrays;

/*
 * 824. Goat Latin
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase 
letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then 
add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin.*/ 

public class GoatLatin {

	public static void main(String[] args) {
		GoatLatin gl = new GoatLatin();
		String s = "I epeak aoat uatin";
		System.out.println(gl.toGoatLatin(s));
	}
	
	public String toGoatLatin(String S) {
		String[] words = S.split("\\s");
		StringBuilder finalString = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			if(!isVowel(words[i].charAt(0))) {
				words[i] = words[i].substring(1) + words[i].charAt(0);
			} 
			finalString = finalString.append(words[i]);
			finalString = finalString.append("ma");
			int a = i;
			while(a >= 0) {
				finalString = finalString.append("a");
				a--;
			}
			finalString = finalString.append(" ");
		}
		return finalString.toString().trim();
	}
	
	private boolean isVowel(char c) {
		if(c == 'a' || c == 'A' ||
				c == 'e' || c == 'E' ||
				c == 'i' || c == 'I' ||
				c == 'o' || c == 'O' ||
				c == 'u' || c == 'U') {
			return true;
		} 
		return false;
	}
}