package stringPrograms;

/**
 * Question: Write a java program to reverse a string.
 */
public class Q1 {
	public static void main(String[] args) {

		/**
		 * Steps: 1. create string var to store string 2. integrate over the string in
		 * reverse direction 3. concatenate the character to rev variable 4. Print the
		 * reversed string
		 */
		String s = "India";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}
}
