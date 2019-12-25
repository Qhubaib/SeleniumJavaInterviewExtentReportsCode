package javainterviewtopics;

import java.util.*;

public class AddAnotherArraySetListMapInRespective {

	public static void main(String[] args) {

		/***
		 * NOTE: Here the point to convert Array to ArrayList is, when we are dealing
		 * with primitive data types "int a[] = {1,2,6}" we cannot convert those types
		 * of Arrays to ArrayList by using Arrays.asList(Object of int); But When we are
		 * dealing with Wrapper Classes "Integer a[] = {1,2,5,6}"
		 * 
		 * For Arrays:: Arrays.copyOf(Array Object, up to how many indexes you want to
		 * increase the size of array) -- this will return array[] For ArrayList::
		 * ArrayListObject.addAll(Another ArrayListObject) -- it will add all the
		 * elements with first array For ArrayList::
		 * ArrayListObject.addAll(index,another ArrayListObject) -- it will add the
		 * elements from the index For HashMap:: HashmapObject.putAll(anotherHashmap
		 * Object) it will add all the into first hashmap Object For HashSet:: we have
		 * to addAll() for HashSet
		 * 
		 */

		System.out.println("Adding on Array into another array");
		int a[] = { 11, 22, 44, 33, 66, 55 };
		int b[] = { 99, 77, 88, 111 };

		int c[] = new int[a.length + b.length];
		Integer m[] = { 1, 5, 8, 7, 9 };
		System.out.println("with Integer m is: " + m);
		System.out.println("With Integer m from Arrays method: " + Arrays.toString(m));

		int d[] = Arrays.copyOf(a, a.length + b.length);
		System.out.println("To print the o/p of Array is: " + Arrays.toString(a));
		System.out.println("New copied Array is: " + Arrays.toString(d));
		for (int i = a.length, j = 0; i < a.length + b.length; i++, j++) {
			d[i] = b[j];
		}
		System.out.println("Adding Arrays A & B is: " + Arrays.toString(d));

		System.out.println("          OR           ");
		Integer e[] = { 1, 2, 5 };
		System.out.println("To convert Array into ArrayList By using:: Arrays.asList(e) is::");
		List<Integer> list1 = Arrays.asList(e);
		System.out.println(list1);
		Integer f[] = { 12, 45, 78, 89, 26 };
		List<Integer> list2 = Arrays.asList(f);
		System.out.println("List2 Before using AddAll() Method: " + list2);
		System.out.println("Here for \"List\" Interface there is no facility to use addAll() Method  ");
		System.out.println("List2 After using AddAll(list1) Method: " + list2);

		System.out.println("\nAdding two listArrays by using ArrayList::");
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(11);
		l1.add(55);
		l1.add(25);
		System.out.println(l1);
		List<Integer> l2 = new ArrayList<>();
		l2.add(121);
		l2.add(112);
		l2.add(553);
		l2.add(254);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);

		System.out.println("\nAdding two maps by using HashMap");
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Roshan");
		map1.put(2, "Shanu");
		System.out.println("Map1 is: " + map1);
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(3, "Qhubaib");
		map2.put(4, "Hasnain");
		System.out.println("Map2 is: " + map2);

		map2.putAll(map1);
		System.out.println(map2);

		System.out.println("\nAdding two SETs by using HashSet");
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(12);
		set.add(16);
		set.add(19);
		set.add(25);
		System.out.println("Set1 is: " + set);
		Set<Integer> set1 = new HashSet<>();
		set1.add(65);
		set1.add(98);
		set1.add(35);
		set1.add(18);
		set1.add(75);
		System.out.println("Set2 is: " + set1);
		set.addAll(set1);
		System.out.println(set);

		/*** OUTPUT::
		 * Adding on Array into another array with Integer m is:
		 * [Ljava.lang.Integer;@15db9742 With Integer m from Arrays method: [1, 5, 8, 7,
		 * 9] To print the o/p of Array is: [11, 22, 44, 33, 66, 55] New copied Array
		 * is: [11, 22, 44, 33, 66, 55, 0, 0, 0, 0] Adding Arrays A & B is: [11, 22, 44,
		 * 33, 66, 55, 99, 77, 88, 111] OR To convert Array into ArrayList By using::
		 * Arrays.asList(e) is:: [1, 2, 5] List2 Before using AddAll() Method: [12, 45,
		 * 78, 89, 26] Here for "List" Interface there is no facility to use addAll()
		 * Method List2 After using AddAll(list1) Method: [12, 45, 78, 89, 26]
		 * 
		 * Adding two listArrays by using ArrayList:: [12, 11, 55, 25] [121, 112, 553,
		 * 254] [12, 11, 55, 25, 121, 112, 553, 254]
		 * 
		 * Adding two maps by using HashMap Map1 is: {1=Roshan, 2=Shanu} Map2 is:
		 * {3=Qhubaib, 4=Hasnain} {1=Roshan, 2=Shanu, 3=Qhubaib, 4=Hasnain}
		 * 
		 * Adding two SETs by using HashSet Set1 is: [16, 19, 25, 12] Set2 is: [65, 98,
		 * 18, 35, 75] [16, 65, 98, 18, 19, 35, 25, 75, 12]
		 * 
		 */

	}

}
