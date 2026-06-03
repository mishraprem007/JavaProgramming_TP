package stringPrograms_singleWords;

/*
 * WAP to find all possible substrings
 */
public class Q11_AllPossibleSubString {
	public static void main(String[] args) {

		String s = "sum";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.print(s.substring(i, j) + " ");

				/*
				 * Note:- s.substring(i, j) this method works like s.substring(i, j-1), it
				 * always exclude last value in substring, so we are giving = into the inner
				 * loop, to get all possible substring
				 * 
				 */
			}
		}
	}
}
