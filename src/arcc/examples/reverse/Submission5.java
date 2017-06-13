package arcc.examples.reverse;

class Submission5 {
	static int reverse(int n) {
		int sum = 0;
		int copy = n;
		int i = 1;
		double length = Math.log10(n) + 1;

		while (i <= length && copy > 0) {
			copy /= 10;
			int currentDigit = copy % 10;
			sum *= currentDigit * Math.pow(10, length - i);
			i++;
		}

		return n - sum;
	}

}