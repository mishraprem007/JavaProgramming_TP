package string_With_Sentence;

import java.util.Arrays;

/*
 * WAP swap first word with last word in a sentence
 */
public class Q3_SwapTwoStrings {
	public static void main(String[] args) {
		String s = "I am Sumanth";
		String[] str = s.split(" ");
		String temp = str[str.length - 1];
		str[str.length - 1] = str[0];
		str[0] = temp;
		System.out.println(Arrays.toString(str));
	}
}
