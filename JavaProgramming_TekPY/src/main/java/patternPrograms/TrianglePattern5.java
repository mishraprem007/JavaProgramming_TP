package patternPrograms;

public class TrianglePattern5 {
/*
 Print 
1          
1  2        
1  2  3      
1  2  3  4    
1  2  3  4  5  
 */
	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i >= j) {
					System.out.print(j+"  ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}