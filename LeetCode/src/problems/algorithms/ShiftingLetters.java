package problems.algorithms;

/*848. Shifting Letters

We have a string S of lowercase letters, and an integer array shifts.

Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a'). 

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.

Return the final string after all such shifts to S are applied.*/
public class ShiftingLetters {

	public static void main(String[] args) {
		ShiftingLetters sl = new ShiftingLetters();
		String S = "abc";
		int[] shifts = {3,5,9};
		System.out.println(sl.shiftingLetters(S, shifts));
	}
	
	public String shiftingLetters(String S, int[] shifts) {
        char[] charArray = S.toCharArray();
        for(int j = 0; j < S.length(); j++) {
        	for(int i = 0; i <= j; i++) {
        		if(charArray[i] + shifts[j] > 122) {
                	charArray[i] = (char) (charArray[i] + (shifts[j]%26));
                } else {
                	charArray[i] = (char) (charArray[i] + shifts[j]);
                }
        	}
        }
        return String.valueOf(charArray);
    }
	
}
