package javainterviewtopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualsArraySetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,9,6};
		int b[] = {1,2,3,5,9,6};
		
		boolean bool = Arrays.equals(a, b);
		System.out.println(bool);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(6);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(9);
		list1.add(6);
		boolean listequal=list1.equals(list);
		
		System.out.println("Both the arraylists are equal: "+listequal);
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(9);
		set.add(6);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(5);
		set1.add(9);
		set1.add(6);
		
		boolean setequals = set.equals(set1);
		boolean setarraylistequals=set.equals(list1);
		System.out.println("Both the sets are equal: "+setequals);
		System.out.println(set1+" "+list1);
		System.out.println("Both the set & arraylist are equal: "+setarraylistequals);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(2,"two");
		map.put(1, "one");
		
		Map<Integer,String> map1 = new LinkedHashMap<>();
		map1.put(1, "one");
		map1.put(2,"two");
		
		System.out.println("Two Maps are equal: "+map.equals(map1));
	
	}

}
