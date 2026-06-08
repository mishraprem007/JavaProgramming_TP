package numberProgram;

/*
 * WAP to check if a number is prime
 */
public class Q1_PrimeNumber {
	/*
	 * Prime Number - divisible by one and itself only, in sum we have only one
	 * prime no that is 2 (1 is not a prime no)
	 */
	public static void main(String[] args) {

		int num = 19;
		boolean flag = true;
		if (num < 2) {
			flag = false;
		} else {
			for (int i = 2; i <= num - 1; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}

			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
