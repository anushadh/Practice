package problems.contest;

import java.io.*;
import java.util.*;

/*You need to tell, how many minimum number of characters he needs to add in the original word for making this type of pattern.      


Input Format
First line  represents total number of characters in the word, which is of integer type N. 
Second line represents a word, which is of string type containing alphabets and digits only which is case-sensitive.


Constraints
3<=N<=5000

Output Format
You need to print desired minimum number of characters needs to add in the original word.*/

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String word = sc.next();
    	
    	if(N >= 3 && N <= 5000) {
    		int count = 0;
    		char[] charArray = word.toCharArray();
    		int start = 0;
    		int end = N-1;
    		
    		while(start < end) {
    			if(charArray[start] != charArray[end]) {
    				count++;
    			}
    			start++;
    			end--;
    		}
    		
    		/*int mid = N/2;
    		if(N%2 != 0) {
    			mid = N/2 + 1;
    		}*/
    		/*for(int i = 0; i <= N/2-1; i++) {
				boolean available = false;
				for(int j = mid; j < N; j++) {
					if(charArray[i] == charArray[j]) {
						available = true;
						break;
					}
				}
				if(!available) count++;
			}*/
    		
    		System.out.println(2*count);
    	}
    	sc.close();
    	
   }
}