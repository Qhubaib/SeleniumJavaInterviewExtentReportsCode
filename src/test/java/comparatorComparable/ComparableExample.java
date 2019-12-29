package comparatorComparable;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {

		/***
		 * Comparable is a interface where every Wrapper class implements this interface
		 * let say if we have created new class - for this we want to sort, in this scenario we have to use 
		 *    implements Comparable<ClassName> where we need to implements unimplemented method --> public int compareTo();
		 *    in that particular class
		 */
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(4,"Hasnain",19));
		list.add(new Student(1,"Roshan",01));
		list.add(new Student(3,"Qhubaib",06));
		list.add(new Student(2,"Sadaddin",27));
		
		Collections.sort(list);
		
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		/***
		 *  Student [id=1, name=Roshan, rollno=1]
			Student [id=2, name=Sadaddin, rollno=27]
			Student [id=3, name=Qhubaib, rollno=6]
			Student [id=4, name=Hasnain, rollno=19]

		 */
	}

}
