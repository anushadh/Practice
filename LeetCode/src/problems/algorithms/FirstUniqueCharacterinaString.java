package problems.algorithms;

/*387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
		Note: You may assume the string contain only lowercase letters.*/


public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		FirstUniqueCharacterinaString fucs = new FirstUniqueCharacterinaString();
		String s = "--lleetcode";
		System.out.println(fucs.firstUniqChar(s));
	}
	
	public int firstUniqChar(String s) {
        if(s.length() == 0 || s.equals("") || s.trim() == "") {
        	return -1;
        } 
        
        for(int i = 0; i < s.length(); i++) {
        	boolean isUnique = true;
        	for(int j = 0; j < s.length(); j++) {
        		if((i!=j) && s.charAt(i) == s.charAt(j)) {
        			isUnique = false;
        			break;
        		}
        	}
        	if(isUnique) {
        		return i;
        	}
        }
        return -1;
    }

}