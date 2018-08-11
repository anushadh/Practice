package problems.algorithms;

/*Problem 258:
	
	Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

*/
public class AddDigits {

	public static void main(String[] args) {
		AddDigits ad = new AddDigits();
		int num = 999;
		System.out.println(ad.addDigits(num));;
	}

	public int addDigits(int num) {
		if(num < 10) {
			return num;
		}
		int sum = 0;
		int rem = 0;
		while(num > 0) {
			rem = num%10;
			num = num/10;
			sum = sum + rem;
			if(num == 0 && sum > 9) {
				num = sum;
				sum = 0;
			}
		}
		return sum;
	}
}
