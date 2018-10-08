package probelms;

import java.util.Arrays;
import java.util.Scanner;

/*The java string toLowerCase() method converts all characters of the string into lowercase letter. Try this problem using toLowerCase() method.

Given a string S, convert it into lowercase.

Input : 
First line of input contains a single integer T denoting the number of test cases.
For each test case there will be only one lline containing string S which consists of uppercase or lowercase engllish alphabets.

Output : 
For each test case, print the string in lowercase.

Constraints : 
1 <= T <= 100
1 <= Length of S <= 103

Example : 
Input : 
2
ABCddE
LMNOppQQ

Output : 
abcdde
lmnoppqq*/

public class JavaConvertStringtoLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if(T >= 1 && T <= 100) {
			for(int i = 0; i <= T; i++) {
				String S = sc.nextLine();
				if(S.length() >= 1 && S.length() <= 1000) {
					System.out.println(convertToLowerCase(S));
				}
			}
		}
	}
	
	private static String convertToLowerCase(String S) {
		return S.toLowerCase();
	}
}
