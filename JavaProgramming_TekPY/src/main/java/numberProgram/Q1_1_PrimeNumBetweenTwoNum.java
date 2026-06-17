package numberProgram;

/*
 *#1.1 Find Prime number between two Numbers
 */
public class Q1_1_PrimeNumBetweenTwoNum {
	public static void getPrimeNumBetweenTwoNumbers(int start, int end) {
		for (int num = start; num <= end; num++) {
			boolean flag = true;
			if (num < 2) {
				flag = false;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		getPrimeNumBetweenTwoNumbers(1, 10);
	}

}
