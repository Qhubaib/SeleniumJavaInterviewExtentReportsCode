package javainterviewtopics;

public class FinalClass {

	/***
	 *  if a variable declared as final you cannot modified the variable value
	 *  if you are declaring variable as final you must assign the value - otherwise you will get CE
	 *  we can do overload operations on final methods
	 *  
	 *  if you declared class as final you can't do inheritance operation to that class
	 *  You cannot override the final method from superclass/parent class
	 *  
	 *  
	 *  For Local variable you need to initialize the value - let say you have variable i without any initialization you wont get
	 *  Any error when you try print sop(i) --> then you will get CE 
	 *  For Instance variable you need not to initialize the value (by default it will be having '0' for int -- for String "null")
	 *  for float "0.0" -- for double "0.0" -- for char " " [single space] -- for byte "0" -- for boolean "false"
	 */
	
	final static int j = 25;
	//final static int m; CE will come in this scenario
	static int h;
	static String str;
	static float f;
	static double d;
	static char c;
	static byte b;
	static boolean bool;
	public static void main(String[] munna) {

		final int i =10; //if you declare final to variable you cannot change the value
		//i = 20;CE  // the final local variable 'i' cannot be assigned
		int l;
		l=2;
		System.out.println(l);
		System.out.println(bool);
		
		int k =j*12; //we can able to assign the value of final variable to another variable
		
		System.out.println("Variable of k=j*12 - i=i*12:: "+k+" "+i*12);
		FinalClass obj = new FinalClass();
		obj.sum();
		obj.sum(3);
	}

	public final void sum()
	{
		System.out.println("This is final sum() method in Final Class");
	}
	
	public final void sum(int i)
	{
		System.out.println("This is sum(int i) method in Final Class");
	}
}

class Final extends FinalClass
{
	public static void main(String[] munna)
	{
		Final f = new Final();
		f.sum();
		f.sum(1);
	}
}
