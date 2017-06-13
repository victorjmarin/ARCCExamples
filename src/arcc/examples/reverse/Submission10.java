package arcc.examples.reverse;

class Submission10 {
	static int reverse(int n) {
		int sum = 0;
		int newN = n;
		double length = Math.floor(Math.log10(n)) + 1;

		for (int i = 1; i <= length && newN > 0; i++) {
			int currentDigit = newN % 10;
			sum += currentDigit * Math.pow(10, length - i);
			newN /= 10;
		}

		return n - sum;
	}
}