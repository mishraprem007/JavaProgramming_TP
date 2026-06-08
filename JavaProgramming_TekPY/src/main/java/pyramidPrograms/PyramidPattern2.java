package pyramidPrograms;
/*
 
      1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1 
 
 */

public class PyramidPattern2 {

	public static void main(String[] args) {

		int n = 4;
		/* rows */

		for (int i = 1; i <= n; i++) {
			/* space */
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			/* increasing number */
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			/* decreasing number */
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

	}
}
