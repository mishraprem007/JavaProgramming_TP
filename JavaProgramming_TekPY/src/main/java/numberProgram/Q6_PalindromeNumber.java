package numberProgram;
/*
 * WAP to check if a number is palindrome
 */
public class Q6_PalindromeNumber {
	/*
	 * Steps:
	 * 1. Declare a variable 
	 * 2. Extract 
	 * 3. Logic to reverse the number
	 * 4. Divide by 10
	 * 5. compare values
	 */
	public static void main(String[] args) {

		int num=151;
		int rev=0;
		int temp=num;
		while(num>0) {
			int d=num%10;
			rev=rev*10+d;
			num = num/10;
			
		}
		if(rev==temp) {
			System.out.println(temp+" :is plaindrome");
		}else {
			System.out.println(temp+" :is not plaindrome");
		}
	}

}
