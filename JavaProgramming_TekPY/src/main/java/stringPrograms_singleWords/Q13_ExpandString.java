package stringPrograms_singleWords;

import javax.net.ssl.SSLContext;

/*
 * Expand String - Print from a3b2a1c1 to aaabbac
 */
public class Q13_ExpandString {

	public static void main(String[] args) {

		String s = "a3b2a1c1";
		for (int i = 0; i < s.length(); i = i + 2) {
			int count = s.charAt(i + 1) - 48;
			

			/*
			 * -48 used to convert char into number
			 */

			char ch = s.charAt(i);
			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}

		}

	}

}
