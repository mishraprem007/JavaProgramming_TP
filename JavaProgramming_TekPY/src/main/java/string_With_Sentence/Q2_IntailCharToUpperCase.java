package string_With_Sentence;

/*
 * Convert initial Char ToUpper Case of each words
 */
public class Q2_IntailCharToUpperCase {

	public static void main(String[] args) {
		String s = "India is a champion";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String s1 = str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ");
		}

	}

}
