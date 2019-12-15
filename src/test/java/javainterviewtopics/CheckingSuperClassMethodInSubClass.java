package javainterviewtopics;

/**
 * 
 * @author Qhubaib
 * You can create the object outside the main() method
 * but if we want to use the same object you have to use any method()
 * if you wanna use the object in main() method -- you have to make it as static
 * 
 *  *** Important Note ****
 *  if you have a public class -- in public class you have sum() & this method print some value in console
 *  another default subclass class extends the public class & creates the object of it in main() method
 *  in this scenario if you try to call the sum() method from default class it wont print the value in console
 *  if you want operate the methods of default class/public class -- you have to create an object in public class main() & 
 *  you can use the method -- by using the object --> in this scenario only it will print the value in console
 *
 */
public class CheckingSuperClassMethodInSubClass {
	
	public void sum()
	{
		System.out.println("This is sum method in \"CheckingSuperClassMethodInSubClass\" ");
	}
	
	public static void main(String[] args)
	{
		CheckingSuperClassMethodInSubClass obj = new SubClass();
		obj.sum();
	}

}

class SubClass extends CheckingSuperClassMethodInSubClass
{
	static SubClass obj2 = new SubClass();
	static SubClass obj3;
	public void sum()
	{
		System.out.println("This is subclass sum method");
	}
	
	public static void main(String[] args)
	{
		SubClass obj = new SubClass();
		obj.sum();
		obj3.sum();
	}
	public void sub()
	{
		System.out.println("this is sub() exist in sub class only");
	}
}
