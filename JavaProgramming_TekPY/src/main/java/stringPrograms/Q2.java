package stringPrograms;

/**
 * write a java program to check if string is a plaindrome
 */
public class Q2 {

	public static void main(String[] args) {
		/**
		 * Steps: 
		 * 1. Reverse String 
		 * 2. Check if given string is plaindrome or not 
		 * 3. Palindrome/not
		 */

		String str = "Mam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// rev = rev + str.charAt(i);
			rev += str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not plaindrome");
		}
	}
}
