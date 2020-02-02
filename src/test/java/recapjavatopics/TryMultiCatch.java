package recapjavatopics;


public class TryMultiCatch {

	public static void main(String[] args) {

		int a=8;
		int b=0, k=0;
		
		try
		{
			k=a/b;
		}		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This has to get executed irrespective of try catch result");
		}
		System.out.println(k);
	}

}
