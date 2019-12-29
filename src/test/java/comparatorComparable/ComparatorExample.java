package comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	/***
	 * Comparator interface is useful in two ways
	 * 1.Let say we dont have any implements of Comparable interface for Class Student2
	 * 2.In other scenario we have a jar file/we have class to just use but we cant do any modifications to that
	 * 3.Let say we have to sort the elements in the with other variable - in this scenario we have sorted the 
	 *   elements with "Student id" reference - Let say i want to sort is by using "Student rollno" so in this case
	 *   we have to use Comparator interface which is having compare method which accepts two objects of a class as parameters
	 * 
	 */

	public static void main(String[] args) {

		List<Student2> list = new ArrayList<>();
		
		list.add(new Student2(4,"Hasnain",19));
		list.add(new Student2(1,"Roshan",19));
		list.add(new Student2(3,"Qhubaib",06));
		list.add(new Student2(2,"Sadaddin",27));
		
		Comparator<Student2> com = new Comparator<Student2>()
				{
					public int compare(Student2 s1,Student2 s2)
					{
						if(s1.rollno > s2.rollno)
							return -1; //Here if we return negative value means it will give you descending order
						else           // positive value means it will give ascending order
							return 1; 
					}
				};
		
		Collections.sort(list,com);
		
		for(Student2 s:list)
		{
			System.out.println(s);
		}
	}
	
	/**
	 *  Student [id=2, name=Sadaddin, rollno=27]
		Student [id=4, name=Hasnain, rollno=19]
		Student [id=1, name=Roshan, rollno=19]
		Student [id=3, name=Qhubaib, rollno=6]

	 */

}
