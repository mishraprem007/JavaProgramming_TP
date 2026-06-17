package numberProgram;

public class Q2_2_FibonacciBetweenTwoNumbers {

	public static void getFibonacciBetweenTwoNumbers(int start, int end) {
		int a = 0, b = 1;
		while (a <= end) {
			if (a >= start) {
				System.out.print(a + " ");
			}
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		getFibonacciBetweenTwoNumbers(1, 10);
	}

}
