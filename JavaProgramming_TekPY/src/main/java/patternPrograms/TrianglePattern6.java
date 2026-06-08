package patternPrograms;
/*
 Print
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 

 */
public class TrianglePattern6 {

	public static void main(String[] args) {

		int size = 5;

		for (int i = 1; i <= size; i++) {
			int k = 1;
			for (int j = 1; j <= 5; j++) {
				if ((i + j) >= (size + 1)) {
					System.out.print(k + " ");
					k++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
