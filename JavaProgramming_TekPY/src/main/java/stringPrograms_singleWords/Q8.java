package stringPrograms_singleWords;

/**
 * WAP to find the number of alphabets,digits and special char in a String
 */
public class Q8 {

	public static void main(String[] args) {
		/*
		 * Steps: 
		 * #1. Take a string data 
		 * #2. create 3 variables digit count, alphabet
		 * count and special char count 
		 * #3. Iterate over the string 
		 * #4. check if char is
		 * digit then increase the char count 
		 * #5. check if char is lower case or upper
		 * case alphabet and increase the count 
		 * #6. other wise increase the count of
		 * special char 
		 * #7. print all the 3 values
		 */
		String s = "abc123";
		int alphaCount = 0, digitCount = 0, specialCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				digitCount++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alphaCount++;
			} else
				specialCount++;
		}
		
		System.out.println("digitCount: "+digitCount);
		System.out.println("alphaCount: "+alphaCount);
		System.out.println("specialCount: "+specialCount);
	}
}
