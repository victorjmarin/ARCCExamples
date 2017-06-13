package arcc.examples.reverse;

class Submission6 {
	static int reverse(int n) {
		int sum = 0, currentDigit = 0;
		int i = 1;
		double length = Math.floor(Math.log10(n)) + 1;

		while (i <= length && n > 0) {
			sum += currentDigit * Math.pow(10, length - i);
			n /= 10;
			currentDigit = n % 10;
		}

		return n - sum;
	}

}