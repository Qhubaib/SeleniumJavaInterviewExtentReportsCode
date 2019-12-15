package javainterviewtopics;

/***
 * 
 * @author roshan
 *  catch block message is: / by zero
	This is finally block -- for 5/0 == 0
	
	catch block of sum() method:: this is qhubaib generated sum exception
	This is finally block -- 5 > 4
	
	this is qhubaib generated mul exception
	QhubaibCreatedException is has got thrown

	
	inside try block
	Exception in thread "main" 
	This will execute even after exception
	java.lang.ArithmeticException: / by zero
	at javainterviewtopics.FinallyClass.nonrelatedexception(FinallyClass.java:95)
	at javainterviewtopics.FinallyClass.main(FinallyClass.java:29)

 *
 */

public class FinallyClass {
	
	int m = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinallyClass obj = new FinallyClass();
		obj.divide();
		obj.sum();
		obj.mul();
		obj.nonrelatedexception();
	}
	
	public void divide()
	{
		try {
			if(m/0==0)
			{
				System.out.println("divided by zero is double equals to 0");
				throw new QhubaibCreatedException("this is qhubaib generated divide exception");
			}
		}
		catch(Exception e)
		{
			System.out.println("catch block message is: "+e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block -- for 5/0 == 0");
		}
	}
	
	public void sum()
	{
		try
		{
			if(m > 4)
			{
				throw new QhubaibCreatedException("this is qhubaib generated sum exception");
			}
		}
		catch(QhubaibCreatedException e)
		{
			System.out.println("\ncatch block of sum() method:: "+e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block -- 5 > 4");
		}
		
	}
	
	public void mul() 
	{
		try
		{
			if(m*5 > 20)
			{
				throw new QhubaibCreatedException("this is qhubaib generated mul exception");
			}
		} catch (QhubaibCreatedException e) {
			e.getStackTrace();
			System.out.println("\n"+e.getMessage());
		}
		finally
		{
			System.out.println("QhubaibCreatedException is has got thrown");
		}
	}
	
	public void nonrelatedexception()
	{
		int j = 10;
		try
		{
			System.out.println("inside try block");
			int k = j/0;
			System.out.println(k);
		}
		catch(NullPointerException e)
		{
			System.out.println("This is null pointer exception");
		}
		finally
		{
			System.out.println("\nThis will execute even after exception");
		}
	}

}

class QhubaibCreatedException extends Exception
{

	public QhubaibCreatedException(String string) {
		super(string);
	}
	
}
