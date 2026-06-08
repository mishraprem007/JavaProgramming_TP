package numberProgram;

/*
WAP to swap two numbers without using a third variable
 */
public class Q5_SwapNumbers {
	/*
	 * Steps: 1. add a and b 
	 * 2. subtract b from a (b=a-b) 
	 * 3. subtract b from a (a=a-b) 
	 * 4. Print a and b
	 */
	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}
}
