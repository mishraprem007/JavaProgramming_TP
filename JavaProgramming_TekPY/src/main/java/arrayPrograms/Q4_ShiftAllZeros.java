package arrayPrograms;

import java.util.Arrays;

/*
 * WAP to to shift all zeroes to the left side
 */

public class Q4_ShiftAllZeros {
	/*
	 * 1. Declare an array 2. Create another array to copy the element from original
	 * array if any element in the array is a non zero element add it to the new
	 * array 3. Print the elements in the array
	 *
	 */
	public static void main(String[] args) {

		int[] a = { 0, 0, 0, 1, 2, 3, 4, 0 };
		int b[] = new int[a.length];
		int index = b.length - 1;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				b[index--] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));

	}
}
