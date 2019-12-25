package javainterviewtopics;

import java.util.*;

public class RemoveElementsArraySetMap {

	public static void main(String[] args) {

		/**
		 * Removing Elements from an array - Middle Value:: Array Object is: [I@15db9742
		 * a length is: 5 & b length is: 5 1 5 4 9
		 * 
		 * Removing Elements from an arrayList - Middle Value:: ArrayList Object is:
		 * [12, 14, 56, 11, 9] After Removing middle element from list: [12, 14, 11, 9]
		 * 
		 * Removing Elements from an Hashmap - Middle Value:: Map Object is: {null=null,
		 * 1=Roshan, 2=Shanu, 3=Qhubaib, 4=Hasnain, 5=ABC, 6=null, 7=override null,
		 * 11=ABC} null {null=null, 1=Roshan, 2=Shanu, 3=Qhubaib, 4=Hasnain, 6=null,
		 * 7=override null}
		 * 
		 */

		System.out.println("Removing Elements from an array - Middle Value::");
		int[] a = { 1, 5, 6, 4, 9 };
		System.out.println("Array Object is: " + a);// [I@15db9742
		int len = a.length;
		int b[] = new int[len];
		System.out.println("a length is: " + a.length + " & b length is: " + b.length);

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			if (len % 2 != 0) {
				// if the index is
				// the removal element index
				if (i == len / 2) {
					continue;
				}
			}

			// if the index is not
			// the removal element index
			b[j] = a[i];
			System.out.print(b[j] + " ");
		}

		System.out.println("\n\nRemoving Elements from an arrayList - Middle Value::");
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(14);
		list.add(56);
		list.add(11);
		list.add(9);

		System.out.println("ArrayList Object is: " + list.toString());// [12, 14, 56, 11, 9] -- this o/p will be same if
																		// use simply Arraylist Object also
		list.remove(list.size() / 2);
		System.out.println("After Removing middle element from list: " + list + "\n");

		System.out.println("Removing Elements from an Hashmap - Middle Value::");
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Qhubaib");
		map.put(1, "Roshan");
		map.put(5, "ABC");
		map.put(11, "ABC");
		map.put(2, "Shanu");
		map.put(4, "Hasnain");
		map.put(null, null);
		map.put(6, null);
		map.put(7, null);
		map.put(7, "override null");

		System.out.println("Map Object is: " + map.toString());
		map.remove(5);
		map.remove(11, "ABC");// in this case if you try to remove key & value both then you need to give the
								// correct values which is exist in map
		System.out.println(map.get(100));// it returns null value
		System.out.println(map);

		System.out.println("\nRemoving Elements from an SET - Middle Value::");
		Set<Integer> set = new HashSet<>();
		set.add(11);
		set.add(56);
		set.add(62);
		set.add(78);
		set.add(23);

		System.out.println("Set Object is: " + set.toString());// [23, 56, 11, 62, 78]
		System.out.println(set.remove(5));// it will return false if you try to remove the value which is not exist in
											// set
		set.remove(62);
		System.out.println(set);// [23, 56, 11, 78]

		/*** OUTPUT
		 * Removing Elements from an array - Middle Value:: Array Object is: [I@15db9742
		 * a length is: 5 & b length is: 5 1 5 4 9
		 * 
		 * Removing Elements from an arrayList - Middle Value:: ArrayList Object is:
		 * [12, 14, 56, 11, 9] After Removing middle element from list: [12, 14, 11, 9]
		 * 
		 * Removing Elements from an Hashmap - Middle Value:: Map Object is: {null=null,
		 * 1=Roshan, 2=Shanu, 3=Qhubaib, 4=Hasnain, 5=ABC, 6=null, 7=override null,
		 * 11=ABC} null {null=null, 1=Roshan, 2=Shanu, 3=Qhubaib, 4=Hasnain, 6=null,
		 * 7=override null}
		 * 
		 * Removing Elements from an SET - Middle Value:: Set Object is: [23, 56, 11,
		 * 62, 78] false [23, 56, 11, 78]
		 * 
		 */

	}

}
