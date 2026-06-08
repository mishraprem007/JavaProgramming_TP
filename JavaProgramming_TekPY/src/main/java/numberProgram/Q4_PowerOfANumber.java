package numberProgram;

/*
 WAP to find the power of a number
 */
public class Q4_PowerOfANumber {
	/*
	 * WAP to find the power of a number
	 */
	public static void main(String[] args) {

		int num = 25;
		int power = 2;
		int prod = 1;

		for (int i = 1; i <= power; i++) {
			prod = prod * num;
		}
		System.out.println(prod);
	}

}
