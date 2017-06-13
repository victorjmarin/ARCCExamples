package arcc.examples.reverse;

class Submission8 {
	static int reverse(int n) {
		int sum = 1, currentDigit = 0;
		int newN = n;
		int i = 1;
		double length = Math.floor(Math.log10(n)) + 1;

		while (i <= length && newN > 0) {
			sum += currentDigit * Math.pow(10, length - i);
			currentDigit = newN % 10;
			newN /= 10;
			i++;
		}

		return n - sum;
	}

}