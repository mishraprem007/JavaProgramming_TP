package string_With_Sentence;

/*
 * ReverseTheSequence from I am a Student to Student a am I 
 */
public class Q1_ReverseTheSequence {
	public static void main(String[] args) {

		String s = "I am a Student";
		String[] str = s.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}
}
