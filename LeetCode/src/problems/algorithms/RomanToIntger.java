package problems.algorithms;

/*Problem 13:
	Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.*/
public class RomanToIntger {

	public static void main(String[] args) {
		RomanToIntger rt = new RomanToIntger();
		String s = "LVIII";
		System.out.println(rt.romanToInt(s));
	}

	public int romanToInt(String s) {
		int finalValue = 0;
		int length = s.length();
		for(int i = 0; i < length; i++) {
			if(i+1 < length && (getValue(s.charAt(i)) < getValue(s.charAt(i+1)))) {
				finalValue += getValue(s.charAt(i+1)) - getValue(s.charAt(i));
				i = i + 1;
			} else {
				finalValue += getValue(s.charAt(i));
			} 
		}
		return finalValue;
	}

	public int getValue(char c) {
		switch (c) {
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		}
		return 0;
	}
	
	/*public int romanToInt(String s) {
        int finalValue = 0;
        int length = s.length();
        for(int i = 0; i < length; i++) {
        	if(s.charAt(i) == 'I'  && i+1 < length && (s.charAt(i+1) == 'V')) {
        		finalValue += 4;
        		i = i+1;
        	} else if(s.charAt(i) == 'I'  && i+1 < length && (s.charAt(i+1) == 'X')) {
        		finalValue += 9;
        		i = i+1;
        	} else if(s.charAt(i) == 'X'  && i+1 < length && (s.charAt(i+1) == 'L')) {
        		finalValue += 40;
        		i = i+1;
        	} else if(s.charAt(i) == 'X'  && i+1 < length && (s.charAt(i+1) == 'C')) {
        		finalValue += 90;
        		i = i+1;
        	} else if(s.charAt(i) == 'C'  && i+1 < length && (s.charAt(i+1) == 'D')) {
        		finalValue += 400;
        		i = i+1;
        	} else if(s.charAt(i) == 'C'  && i+1 < length && (s.charAt(i+1) == 'M')) {
        		finalValue += 900;
        		i = i+1;
        	} else if(s.charAt(i) == 'I') {
        		finalValue += 1;
        	} else if(s.charAt(i) == 'V') {
        		finalValue += 5;
        	} else if(s.charAt(i) == 'X') {
        		finalValue += 10;
        	} else if(s.charAt(i) == 'L') {
        		finalValue += 50;
        	} else if(s.charAt(i) == 'C') {
        		finalValue += 100;
        	} else if(s.charAt(i) == 'D') {
        		finalValue += 500;
        	} else if(s.charAt(i) == 'M') {
        		finalValue += 1000;
        	}
        }
        
        return finalValue;
    }*/

}
