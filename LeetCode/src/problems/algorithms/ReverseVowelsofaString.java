package problems.algorithms;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		ReverseVowelsofaString rvs = new ReverseVowelsofaString();
		String s = "a a a";
		System.out.println(rvs.reverseVowels(s));
	}

	public String reverseVowels(String s) {
		if(s.equals("") || s == null) {
			return "";
		}
		s = s.trim();
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				sb.append(s.charAt(i));
				charArray[i] = '-';
			} 
		}
		int j = sb.length();
		if(j == 0) {
			return new String(charArray);
		}
		for(int i = 0; i < s.length(); i++) {
			if(charArray[i] == '-') {
				j--;
				charArray[i] = sb.charAt(j);
			}
		}
		return new String(charArray);
	}

	private boolean isVowel(char charAt) {
		if(charAt == 'a' || 
				charAt == 'e' ||
				charAt == 'i' ||
				charAt == 'o' ||
				charAt == 'u')
			return true;
		else return false;
	}
}