package arcc.examples.reverse;

class Submission1 {
	static int reverse(int n) {
		int sum = 0;
		int i = 0;
		double length = Math.floor(Math.log10(n)) + 1;

		while (i <= length && n > 0) {
			int currentDigit = n % 10;
			n /= 10;
			sum += currentDigit * Math.pow(10, length - i);
			i++;
		}

		return n + sum;
	}
}