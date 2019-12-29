package comparatorComparable;

public class Student2 {

	int id;
	String name;
	int rollno;
	
	public Student2(int id,String name,int rollno)
	{
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}

	
	
}
