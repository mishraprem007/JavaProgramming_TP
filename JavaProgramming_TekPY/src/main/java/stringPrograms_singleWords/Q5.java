package stringPrograms_singleWords;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Write a java program to print only duplicate char
 */
public class Q5 {

	public static void main(String[] args) {

		String s = "aabbabac";
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch) + 1);
			} else
				hash.put(ch, 1);
		}
		for (Entry<Character, Integer> map : hash.entrySet()) {
			if (map.getValue() > 1) {
				System.out.print(map.getKey() + " " + map.getValue());
			}
		}
	}

}
