package arcc.examples.reverse;

class Submission3 {
	static int reverse(int n) {
		int sum = 0;
		int newN = n;
		int i = 1;
		double length = Math.log10(n);

		while (i <= length && sum >= 0) {
			int currentDigit = newN % 10;
			newN /= 10;
			sum *= currentDigit * Math.pow(10, length - i);
			i++;
		}

		return n - sum;
	}

}