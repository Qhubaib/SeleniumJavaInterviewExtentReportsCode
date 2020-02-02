package recapjavatopics;

public class TryWithThrow {

	public static void main(String[] args) {

		int i=5;
		try
		{
			if(i<10)
			{
				throw new SyedException("This is syed created exception");
			}
		}
		catch(SyedException e)
		{
			System.out.println(e);
		}
	}
}

class SyedException extends Exception
{
	public SyedException(String str)
	{
		super(str);
	}
}
