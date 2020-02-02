package recapjavatopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorConcept {

	public static void main(String[] args) {

		
		List<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(11);
		l1.add(55);
		l1.add(25);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(121);
		l2.add(115);
		l2.add(558);
		l2.add(259);
		l2.addAll(l1);
		
		
		Iterator<Integer> it=l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		
		/* 
		 * The advantage over foreach to iterator is --> when you use for each we cannot remove 
		 *   elements while fetching the values - if you try so you will get Exception.
		 *  when you use iterator() you can remove the elements while fetching
		 */
		System.out.println("Size of list2 before removing elements through iterator(): "+l2.size());
		Iterator<Integer> ite=l2.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next()+" ");
			ite.remove();			
		}
		System.out.println("\nSize of list2 before removing elements through iterator(): "+l2.size());
		
		/*
		 * 12
			11
			55
			25
			[121, 115, 558, 259, 12, 11, 55, 25]
			[121, 115, 558, 259]
			Size of list2 before removing elements through iterator(): 4
			121 115 558 259 
			Size of list2 before removing elements through iterator(): 0
		 */
	}

}
