package problems.algorithms;

/*Problem 344
Write a function that takes a string as input and returns the string reversed.

*/
public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String s = "dsfjdf ";
		System.out.println(rs.reverseString(s));;
	}

	/*//O (N)
	public String reverseString(String s) {
		System.out.println(System.currentTimeMillis());
		StringBuffer sb = new StringBuffer();
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(System.currentTimeMillis());
		return sb.toString();
	}*/
	
	/*//mid swap
	public String reverseString(String s) {
		char[] charArray = s.toCharArray();
 		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			char c = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = c;
			i++;
			j--;
		}
		return new String(charArray);
	}*/
	
	public String reverseString(String s) {
		if(s == "" || s == null) {
			return "";
		}
		char[] charArray = new char[s.length()];
		for(int i = s.length()-1, j = 0; i >= 0; i--, j++ ) {
			charArray[j] = s.charAt(i);
		}
		return new String(charArray);
	}
}

