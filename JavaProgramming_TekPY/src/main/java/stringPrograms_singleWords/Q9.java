package stringPrograms_singleWords;

import java.util.Arrays;

/**
 * WAP to check if given two strings are anagrams
 */
public class Q9 {

	public static void main(String[] args) {
		/**
		 * Check Anagram:-
		 * ##1. Length1 should be equal to length 2
		 * ##2. Anagrams are those words where all the letters of first words is also present in second word
		 * for ex 
		 * 1. abcd and bcaad
		 * 2. Race and care
		 * 3. Tet and Net
		 * 4. Bin and Nib
		 * 5. Read and Dear 
		 * 
		 * 
		 * 
		 * steps:
		 * ##1. Create a string s1 and s2
		 * ##2. Check if length of 2 Strings are same, (if not they are not anagrams)
		 * ##3. If same convert them to array, sort them and compare about after sorting
		 * ##4. If equals they are anagrams else they are not anagrams
		 * 
		 */
		
		
		String s1 = "Read";
		String s2="Dear";
		
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println(s1 +" and "+s2+" are anagrams");
			}
			else {
				System.out.println(s1 +" and "+s2+" are not anagrams");
			}
		}
		else {
			System.out.println(s1 +" and "+s2+" are not anagrams");
		}

	}

}
