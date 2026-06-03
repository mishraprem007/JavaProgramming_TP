package arrayPrograms;

import java.util.Arrays;

/*
 *WAP for left rotation of an integer array 
 */
public class Q3_LeftRotationArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		for (int i = 1; i <= 6; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
