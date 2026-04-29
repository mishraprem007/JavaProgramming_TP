package stringPrograms_singleWords;

/**
 * WAP to find the sum of numbers in a string
 */
public class Q7 {

	public static void main(String[] args) {
		/**
		 * Steps: 1. Declare String 2. create a var called sum 3. Iterate over the
		 * string 4. If the no is digit then add to sum 5. print sum
		 */

		String s = "abc123";

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				
				/*
				 *  ch - 48 --> because converting char into number
				 */
				sum = sum + ch - 48;
			}
		}
		System.out.println(sum);

	}

}
