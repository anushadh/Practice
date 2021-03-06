package problems.algorithms;

/*541. Reverse String II

Given a string and an integer k, you need to reverse the first k characters for every 2k characters 
counting from the start of the string. If there are less than k characters left, reverse all of them. 
If there are less than 2k but greater than or equal to k characters, then reverse the first
k characters and left the other as original.

Input: s = "abcdefg", k = 2
Output: "bacdfeg"*/
	
public class ReverseStringII {

	public static void main(String[] args) {
		ReverseStringII rs2 = new ReverseStringII();
		String s = "abcdefg";
		int k = 2;
		System.out.println(rs2.reverseStr(s, k));
	}
	
	public String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i = i*2*k) {
        	for(int j = i+k-1; j >=i; j--) {
        		sb.append(chars[j]);
        	}
        	if(i*2*k >= chars.length) {
        		if(chars.length-1-(i+k-1) < k) {
        			for(int m = chars.length-1; m >= (i+k); m--) {
        				sb.append(chars[m]);
        			}
        		}
        	}
        }
        return "";
    }
}
