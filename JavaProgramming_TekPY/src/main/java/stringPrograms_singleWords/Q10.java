package stringPrograms_singleWords;
/**
 * last-4mins
 * WAP to swap 2 string without using a third variable
 */
public class Q10 {

	public static void main(String[] args) {
		/*
		 * Steps;
		 * ##1. Create a string s1
		 * ##2. Create a string s1
		 * ##3. Concat 2 strings
		 * ##4. use 2 arguments substring method
		 * ##5. use 1 arguments substring method
		 */
		String s1 = "Apple";
		String s2 = "Mango";

		System.out.println("Before swapping");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		s1=s1+s2;
		s2=s1.substring(0, s1.length() - s2.length());
		s1.substring(s2.length());
		
		System.out.println("After swapping");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

	}

}
