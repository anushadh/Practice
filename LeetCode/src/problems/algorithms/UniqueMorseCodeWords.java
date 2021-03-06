package problems.algorithms;

import java.util.HashSet;

/*International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:
	
	Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
	For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). 
	We'll call such a concatenation, the transformation of a word.

	Return the number of different transformations among all words we have.*/

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		UniqueMorseCodeWords umcw = new UniqueMorseCodeWords();
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(umcw.uniqueMorseRepresentations(words));
	}
	
	public int uniqueMorseRepresentations(String[] words) {
		if(words != null || words.length > 0) {
			String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
					"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
			HashSet<String> hs = new HashSet<>();
			for(String s : words) {
				StringBuilder sb = new StringBuilder();
				for(char c : s.toCharArray()) {
					sb.append(morseCodes[c - 'a']);
				}
				/*String word = words[i];
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < word.length(); j++) {
					sb.append(morseCodes[word.charAt(j) - 97]);
				}*/
				//System.out.println(String.valueOf(sb));
				hs.add(String.valueOf(sb));
			}
			return hs.size();
		}
        return 0;
    }
}
