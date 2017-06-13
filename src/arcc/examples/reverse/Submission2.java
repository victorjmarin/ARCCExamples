package arcc.examples.reverse;

class Submission2 {
	static int reverse(int n) {
		int sum = 1;
		int copy = n;
		int i = 1;
		double length = Math.floor(Math.log10(n)) + 1;

		while (copy > 0 && i <= length) {
			int currentDigit = copy % 10;
			copy /= 1;
			sum += currentDigit * Math.pow(10, length + i);
			i++;
		}

		return sum - n;
	}

}