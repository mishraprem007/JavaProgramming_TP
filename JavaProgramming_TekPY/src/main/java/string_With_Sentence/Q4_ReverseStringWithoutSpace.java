package string_With_Sentence;

/*
 * WAP to reverse a String without reversing spaces
 */
public class Q4_ReverseStringWithoutSpace {

	public static void main(String[] args) {

		String s = "I love India";
		String s1 = s.replace(" ", "");
		int index = s1.length() - 1;

		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print(s1.charAt(index--));
			}
		}
	}

}
