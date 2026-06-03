package arrayPrograms;

/*
 * WAP to find min & max element in array
 */
public class Q1_MaxAndMinElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
