package patternPrograms;
/*
Print 
1     
1 2   
1 2 3 	
 */
public class TrianglePattern44 {
/*
 * outer loop --> lines (rows)
 * Inner loop --> stars(column)
 */
	public static void main(String[] args) {
	/*
	 * 1. Use a nested loop
	 * 2. outer loop runs for the number of rows
	 * 3. inner loop prints '*' based on the condition i>=j
	 */

	int size = 3;
	for (int i = 1; i <= size; i++) {
		for (int j = 1; j <= size; j++) {
			if (i >= j) {
				if (j <= i)
					System.out.print(j + " ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}

}