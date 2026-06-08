package arrayPrograms;

import java.util.LinkedHashSet;

/*
 * WAP to find the pair of numbers equal to a target sum
 */
public class Q7_PairOfNumEqualToTargetSum {
/*
 * sum of element equal to a specific number
 * 
 * 1. Add two values if the sum is equal to a specific number
 * 2. Add the number set
 * 3. if an element is duplicated but set does not allow duplicates
 */
public static void main(String[] args) {
	int[] a = { 1, 2, 3, 5, 6, 7, 8, 1 };

	int targetSum = 9;

	LinkedHashSet set = new LinkedHashSet();

	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] + a[j] == targetSum) {
				/*
				 * tranary operator - true - 1st condition, false - 2nd condition
				 */
				String sum = a[i] > a[j] ? "(" + a[j] + "," + a[i] + ")" : "(" + a[i] + "," + a[j] + ")";
				set.add(sum);
			}
		}
	}
System.out.println(set);
}

}
