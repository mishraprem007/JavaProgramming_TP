package stringPrograms;

import java.util.LinkedHashMap;

/**
 * Write a java program to find the occurrence of each character in a String
 */
public class Q3 {

	public static void main(String[] args) {
		/**
		 * Steps: 1. Take a string 
		 * 2. create a map 
		 * 3. Iterate over string 
		 * 4. Check if ch is present -> if map contains key increment the value using get method and
		 * add it back to map 
		 * -> ch, 1 (if it doesn't contain)
		 */

		String s = "aabbabac";
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch) + 1);
			} else
				hash.put(ch, 1);
		}
		System.out.println(hash);
	}

}
