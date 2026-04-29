package stringPrograms_singleWords;

import java.util.LinkedHashSet;

/**
 * WAP to remove duplicate from a String
 */
public class Q6 {

	public static void main(String[] args) {
		/**
		 * LinkedHashSet doesn't allow duplicate and maintain the insertion order
		 */
		String s = "aabbabac";
		LinkedHashSet set = new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);

	}

}
