package problems.algorithms;

import java.math.BigInteger;

/*65. Valid Number
Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true

Note: It is intended for the problem statement to be ambiguous. 
You should gather all requirements up front before implementing one.*/

public class ValidNumber {

	public static void main(String[] args) {
		ValidNumber vn = new ValidNumber();
		String s = ".1";
		System.out.println(vn.isNumber(s));
	}

	public boolean isNumber(String s) {
		if(s == "" || s.length() == 0 || s.trim() == "") return false;
		s = s.trim();
		try {
			if(s.endsWith("f")) {
				return false;
			}
			if(s.contains("e")) {
				String fPart = s.substring(0, s.indexOf('e'));
				String lPart = s.substring(s.indexOf('e')+1);
				if(fPart.endsWith(" ") || lPart.startsWith(" ")) {
					return false;
				}
				return (isLong(fPart) && isLong(lPart));
			} else {
				return isLong(s) || isDouble(s);
			}
		} catch(Exception e) {
			return false;
		}
	}
	
	public boolean isLong(String s) {
		try {
			long l = Long.parseLong(s);
			return true;
		}catch(Exception e1) {
			return false;
		}
	}
	
	public boolean isDouble(String s) {
		try {
			double d = Double.parseDouble(s);
			return true;
		}catch(Exception e1) {
			return false;
		}
	}
/*	public boolean isNumber(String s) {
        if(s == "" || s.length() == 0 || s.trim() == "") return false;
		s = s.trim();
        try {
            if(s.endsWith("f")) {
				return false;
			}
			long l = Long.parseLong(s);
			return true;
		} catch(Exception e) {
			try {
				double d = Double.parseDouble(s);
				return true;
			}catch(Exception e1) {
			}
		}
		return false;
    }*/
}
