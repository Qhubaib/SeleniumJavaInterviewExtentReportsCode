package recapjavatopics;

/*
 * Super keyword can be called in constructors & methods only
 * 
 * overloading is only in the methods not variables 
 * 	Even though we are giving child object with parent reference - in terms of variables it will call the parent variable only
 * 
 *  super can be used to refer immediate parent class instance variable.
	super can be used to invoke immediate parent class method.
	super() can be used to invoke immediate parent class constructor.
 */

public class SuperKeyword {

	public static void main(String[] args) {

		S s = new Y(4);
		System.out.println(s.i);
		s.show();

		Y y = new Y(4);
		System.out.println(y.i);
		s.show();
		System.out.println(y.k);
	}

}

class S
{
	int i=1;
	int k=55;
	public S()
	{
		System.out.println("Default S");
	}
	public S(int i)
	{
		System.out.println("Para S");
	}
	public void show()
	{
		System.out.println("this is parent show method");
	}
}
class Y extends S
{
	int i=2;
	public Y()
	{
		System.out.println("Default Y");
	}
	public Y(int i)
	{
		super(i);
		System.out.println("Para Y");
	}
	public void show()
	{
		super.show();
		System.out.println("this is child show method");
	}
}


/*
 *  OUTPUT:
Para S
Para Y
1
this is child show method
Para S
Para Y
2
this is child show method

After calling super.show() in child class OUTPUT is:
Para S
Para Y
1
this is parent show method
this is child show method
Para S
Para Y
2
this is parent show method
this is child show method


 */
