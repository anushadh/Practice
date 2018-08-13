package problems.algorithms;

/*Problem 884.
An encoded string S is given.  To find and write the decoded string to a tape, 
the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit (say d), the entire current tape is repeatedly written d-1 more times in total.
Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string.*/

public class DecodedStringatIndex {

	public static void main(String[] args) {
		DecodedStringatIndex dsi = new DecodedStringatIndex();
		String S = "a2345678999999999999999";
		int K = 1;
		System.out.println(dsi.decodeAtIndex(S, K));
	}
	

	public String decodeAtIndex(String S, int K) {
		if(S.length() >= 2 && S.length() <= 100) {
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < S.length(); i++) {
				if(!Character.isDigit(S.charAt(i))) {
					sb.append(S.charAt(i));
				} else {
					System.out.println(sb.length());
					int count = Integer.parseInt(String.valueOf(S.charAt(i)));
					String s = sb.toString();
					count--;
					while(count != 0) {
						sb.append(s);
						count--;
					}
				}
			}
			char atK = sb.toString().charAt(K-1);
			return String.valueOf(atK);
		}
		return "";
	}

}
