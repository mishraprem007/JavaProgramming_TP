package arrayPrograms;

import java.util.Arrays;

/*
 * WAP to find the sum of two arrays
 */
public class Q5_SumOfTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 4 };

		int max = Math.max(a.length, b.length);
		int[] sum = new int[max];

		for (int i = 0; i < max; i++) {
			if (i < a.length) {
				sum[i] += a[i];
			}
			if (i < b.length) {
				sum[i] += b[i];
			}
		}
		System.out.println(Arrays.toString(sum));
	}
}
