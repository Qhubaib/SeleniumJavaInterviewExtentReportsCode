package recapjavatopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrderCollectionArray {

	public static void main(String[] args) {

		Integer a[] = {1,5,4,2,6,9,8,7};
		
		Arrays.sort(a);
		System.out.println("Sorted Array: "+Arrays.toString(a));
		
		List<Integer> list= new ArrayList<>(Arrays.asList(a));
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(22);
		list1.add(45);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(226);
		list2.add(445);
		
		list2.addAll(list1);
		System.out.println(list2);
		list.addAll(list1);
		System.out.println(list);
	}

}
