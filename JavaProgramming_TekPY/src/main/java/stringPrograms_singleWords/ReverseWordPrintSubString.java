package stringPrograms_singleWords;
/*
 * WAP to reverse a word and print the substring
 */
public class ReverseWordPrintSubString {
/*
1. Take a String
2. Reverse the String using builder
3. Iterate over String
4. Call the two arguments substring method
5. Pass 0 and i value as string parameter
 */
	
	public static void main(String[] args) {

	String s = "Hello";

	s = new StringBuilder(s).reverse().toString();
/*
 * We are using = here because substring exclude last boundary value
 */
	for (int i = 1; i <= s.length(); i++) {
		System.out.println(s.substring(0, i));
	}
}
}
