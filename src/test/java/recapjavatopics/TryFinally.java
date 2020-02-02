package recapjavatopics;

/*
 * finally block always associated with try block, if you dont specify try block you cant use finally block
 * catch performs the Exceptional Handling operation & finally performs the clean up activity
 * 
 *  if the System.exit(0) gets called without any exception then finally won’t execute. 
 *  	However if any exception occurs while calling System.exit(0) then finally block will be executed.
 */

public class TryFinally {

	public static void main(String[] args) {

		int a=8;
		int b=0, k=0;
		
		try
		{
			k=a/b;
			System.out.println(k);
			System.exit(0);
		}		
		finally
		{
			System.out.println("This has to get executed irrespective of try catch result");
		}
		System.out.println(k);
	}

}
