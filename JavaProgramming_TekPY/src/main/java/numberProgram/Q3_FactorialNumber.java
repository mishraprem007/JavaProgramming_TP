package numberProgram;

/*
WAP to find a factorial of a number
 */
public class Q3_FactorialNumber {
	/*
	 * In mathematics, the factorial of a non-negative integer is the product of all
	 * positive integers less than or equal to that number.It is denoted by an
	 * exclamation point (!). For example, the factorial of 5 is written as $5!$.
	 * 
	 * 1. 5! = 5*4*3*2*1 
	 * 2. 6! = 6*5*....*1 
	 * 3. 7! = 7*6*....*1 
	 * 4. 100! = 100*....*1
	 */
	public static void main(String[] args) {

		int num = 5;
		int prod = 1;

		for (int i = 1; i <= num; i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}

}
