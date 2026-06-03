package stringPrograms_singleWords;

/*
 * WAP to find all possible substrings whose length is greater than 2
 */
public class Q11_1_AllPossibleSubString2 {
	public static void main(String[] args) {

		String s = "sum";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);

				if (s1.length() >= 2) {
					System.out.println(s1);
				}

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
