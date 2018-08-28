package problems.algorithms;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		ReverseWordsinaStringIII rws = new ReverseWordsinaStringIII();
		String input = "Let's take LeetCode contest";
		System.out.println(rws.reverseWords(input));
	}
	
	public String reverseWords(String s) {
		if(s != null || !s.equals("")) {
			String[] words = s.split("\\s");
			StringBuilder sb = new StringBuilder();
			for(String word : words) {
				sb.append(new StringBuilder(word).reverse().toString());
				sb.append(" ");
			}
			return sb.toString().trim();
		}
		
		return "";
    }
	
	/*//Used in build split method
	public String reverseWords(String s) {
		if(s != null || !s.equals("")) {
			String[] words = s.split("\\s");
			StringBuilder sb = new StringBuilder();
			for(String word : words) {
				char[] ch = word.toCharArray();
				for(int i = ch.length-1; i >= 0; i--) {
					sb.append(ch[i]);
				}
				sb.append(" ");
			}
			return sb.toString().trim();
		}
		
		return "";
    }*/
	
}
