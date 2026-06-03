package stringPrograms_singleWords;

/*
 * WAP to find all possible substrings whose are plaindrome and length is highest
 */
public class Q11_2_MaxHeightLengthSubStringPlaindrome {
	public static void main(String[] args) {
		String s = "aabbabc";
		int length = 0;
		String s3 = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				String s2 = new StringBuilder(s1).reverse().toString();
				if (s1.equals(s2) && length < s1.length()) {
					length = s1.length();
					s3 = s1;
				}
			}
			/*
			 * Note:- s.substring(i, j) this method works like s.substring(i, j-1), it
			 * always exclude last value in substring, so we are giving j<= into the inner
			 * loop, to get all possible substring
			 * 
			 */
		}
		System.out.println(s3);
	}
}
