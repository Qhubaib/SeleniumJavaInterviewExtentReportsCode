package comparatorComparable;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int rollno;
	
	public Student(int id,String name,int rollno)
	{
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int compareTo(Student s1) {
		
		/**
		 * this > s1 => +
		 * this < s1 => -
		 * this = s1 => 0
		 */
		if(this.id > s1.id)
			return 1;
		else
			return -1;
	}
	
}
