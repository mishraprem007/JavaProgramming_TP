package arrayPrograms;

/*
 * WAP to find 2nd maximum element
 */
public class Q2_SecondMax {

	public static void main(String[] args) {
		int[] a = { 200, 56, 60, 200, 56, 60 };
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				sMax = max;
				max = a[i];
			} else if (a[i] > sMax && a[i] != max) {
				sMax = a[i];
			}
		}

		System.out.println("Max: " + max);
		System.out.println("Second max: " + sMax);
	}

}
