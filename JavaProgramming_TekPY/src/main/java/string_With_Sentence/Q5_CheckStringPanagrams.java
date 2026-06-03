package string_With_Sentence;

import java.util.HashSet;

/*
 * WAP to check if the given String is a panagrams
 */
public class Q5_CheckStringPanagrams {
	/*
	 * Panagrams- All the character from a to z should be present in the sentence
	 * and there could be some repeared char as well, called panagram.
	 */
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";

		String s1 = s.toLowerCase();
		HashSet set = new HashSet();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				set.add(ch);
			}
		}
		if (set.size() == 26) {
			System.out.println(s + " is panagram");
		} else {
			System.out.println(s + " is not a panagram");
		}

	}

}
