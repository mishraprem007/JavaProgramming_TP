package patternPrograms;

/*
 * 	Print 
			    * 
			  * * 
			* * * 
 	
 */
public class TrianglePattern3 {
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
			if (i+j>=size+1) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}

}