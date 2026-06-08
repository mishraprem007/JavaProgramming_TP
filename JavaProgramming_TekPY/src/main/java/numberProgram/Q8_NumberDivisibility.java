package numberProgram;

/*
 * WAP where if a number is divisible by 3, print "hai", 
 * if divisible by 5, print "hi", 
 * and if divisible by both, print "hai bye"
 */
public class Q8_NumberDivisibility {

	public static void main(String[] args) {

		int num = 45;
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("HiBye");
		} else if (num % 3 == 0) {
			System.out.println("Hi");
		} else if (num % 5 == 0) {
			System.out.println("Bye");
		}
	}
}
