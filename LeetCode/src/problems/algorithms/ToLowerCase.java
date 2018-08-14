package problems.algorithms;

/*709. To Lower Case
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */


public class ToLowerCase {

	public static void main(String[] args) {
		ToLowerCase tlc = new ToLowerCase();
		String str = "LOVElY";
		System.out.println(tlc.toLowerCase(str));;
	}

	/*public String toLowerCase(String str) {
		if(str == null || str.equals("") || str.length() == 0) {
			return "";
		}
		return str.toLowerCase(); //using in built function
	}
	*/
	
		//without using inbuilt function a = 97 - 122 A = 65 - 90
	public String toLowerCase(String str) {
		if(str == null || str.equals("") || str.length() == 0) {
			return "";
		}
		char[] strArray = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			int c = strArray[i];
			if(c >= 65 && c <= 90) {
				c +=32;
				strArray[i] = (char) c;
			}
		}
		return String.valueOf(strArray);
	}
}