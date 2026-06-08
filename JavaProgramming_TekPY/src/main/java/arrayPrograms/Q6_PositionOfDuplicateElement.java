package arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * Q6. WAP to find the position of all duplicated elements
 */
public class Q6_PositionOfDuplicateElement {
	/*
	 * 1. Declare an array 
	 * 2. Create a Linked HashMap of integer, arrayList type 
	 * 3. add the elements to the hash map if it's repeated add it to the list 
	 * 4. otherwise add the element to map with arrayList
	 */
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2, 3, 3, 4 };
		LinkedHashMap<Integer, ArrayList> hash = new LinkedHashMap();
		
		for(int i=0; i<a.length; i++) {
			
			if(hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			} else {
				hash.put(a[i], new ArrayList());
			}
		}
		for(Entry<Integer, ArrayList> map: hash.entrySet()) {
			if(map.getValue().size()>0) {
				System.out.println(map.getKey()+" "+map.getValue());
			}
		}

	}
}
