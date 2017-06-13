package arcc.examples.reverse;

class Submission9 {
	static int reverse(int n) {
		int sum = 0;
		int newN = n;
		int i = 1;
		double length = Math.floor(Math.log10(n)) + 1;

		while (i <= length && newN >= 0) {
			int currentDigit = newN % 10;
			newN /= 10;
			sum += currentDigit * Math.pow(10, length - i);
			i++;
		}

		return n / sum;
	}

}