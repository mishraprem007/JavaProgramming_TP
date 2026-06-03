package stringPrograms_singleWords;

/*
 * Compress String - Repetition of same char in running sequence
 */
public class Q12_CompressString {

	public static void main(String[] args) {

		String s = "aabbabac";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.println(s.charAt(i) + " " + count);
				count = 1;
			}
		}
		/*
		 * note: in outer loop we are giving s.length() - 1 - as we are using i+1 in if
		 * condition
		 */

		/* for last char occurance */
		System.out.println(s.charAt(s.length() - 1) + " " + count);
	}

}
