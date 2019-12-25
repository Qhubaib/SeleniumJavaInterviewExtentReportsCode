package javainterviewtopics;

import java.util.*;

public class RetainAllTheElementsFromArraySetListMap {

	public static void main(String[] args) {

		System.out.println("Taking the unique elements from Following Two ArrayList::");

		List<Integer> list = new ArrayList<>();
		list.add(786);
		list.add(456);
		list.add(123);
		list.add(258);
		System.out.println("List is:" + list);
		List<Integer> list1 = new ArrayList<>();
		list1.add(786);
		list1.add(456);
		list1.add(786);
		list1.add(321);
		list1.add(753);
		System.out.println("List1 is:" + list1);
		list.retainAll(list1);
		System.out.println("Retained List is: " + list);

		System.out.println("\nTaking the unique elements from Following Two HashSets::");
		Set<Integer> set = new HashSet<Integer>();
		set.add(111);
		set.add(112);
		set.add(113);
		set.add(111);
		System.out.println("SET is: " + set);
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(111);
		set1.add(112);
		set1.add(117);
		set1.add(119);
		System.out.println("SET1 is: " + set1);
		set.retainAll(set1);
		System.out.println("Retained SET is: " + set);

		System.out.println("\nTaking the unique elements from Following Two HashMaps::");
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Roshan");
		map1.put(2, "Shanu");
		map1.put(3, "Qhubaib");
		map1.put(4, "Hasnain");
		map1.put(6, "ADC");
		System.out.println("Map1 is: " + map1);
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(3, "Qhubaib");
		map2.put(4, "Hasnain");
		map2.put(2, "Shanu");
		map2.put(1, "Roshan Zameer");
		map2.put(9, "POM");
		System.out.println("Map2 is: " + map2);
		map1.replace(3, "Qhubaib", "Munna");
		map1.putAll(map2);
		System.out.println("Map1 is: " + map1);
		Set<Integer> keys = map1.keySet();
		System.out.println(keys);
		Set<Integer> keys1 = map2.keySet();
		System.out.println(keys1);
		keys.retainAll(keys1);
		System.out.println("Unique Keys are: " + keys);
		for (int i : keys) {
			System.out.print(map1.get(i) + " ");
		}

		/** OUTPUT
		 * Taking the unique elements from Following Two ArrayList:: List is:[786, 456,
		 * 123, 258] List1 is:[786, 456, 786, 321, 753] Retained List is: [786, 456]
		 * 
		 * Taking the unique elements from Following Two HashSets:: SET is: [112, 113,
		 * 111] SET1 is: [112, 117, 119, 111] Retained SET is: [112, 111]
		 * 
		 * Taking the unique elements from Following Two HashMaps:: Map1 is: {1=Roshan,
		 * 2=Shanu, 3=Qhubaib, 4=Hasnain, 6=ADC} Map2 is: {1=Roshan Zameer, 2=Shanu,
		 * 3=Qhubaib, 4=Hasnain, 9=POM} Map1 is: {1=Roshan Zameer, 2=Shanu, 3=Qhubaib,
		 * 4=Hasnain, 6=ADC, 9=POM} [1, 2, 3, 4, 6, 9] [1, 2, 3, 4, 9] Unique Keys are:
		 * [1, 2, 3, 4, 9] Roshan Zameer Shanu Qhubaib Hasnain POM
		 */

	}

}
