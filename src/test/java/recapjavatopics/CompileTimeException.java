package recapjavatopics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Throwalbe - Parent class for all exception & errors
 *  Error -->  User/programmer cannot handle Errors     --> JVM Memory Leakage, RAM is running out of memory
 *  Exception --> Checked Exception  --> SQLException, IOException, InteruptedException etc
 *  			  UnChecked Exception --> RuntimeException --> Arithmetic Exception, ArrayIndexOutofBoundException etc..
 *  
 *  You can suppress the exception, instead of handling with the try catch	
 *  
 *  Whenever you have input output operation (java.io) you are dealing with resource
 *  so we need to close the resource after using them.
 *  
 *  Generally we use finally block to close the io connection, But let say if you are using 
 *  finally block only to close the connection then it is not required use it. we can pass that statement within the parameters
 *  of try(like below) -- then you can use try block with throws Exception keyword, or else you can use try block with catch
 *  
 *    The same scenario is not applicable when you use normal exceptions like ArithmeticException etc...
 */

public class CompileTimeException  {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String str = null;
			System.out.println("Enter Your Name: ");
			str = br.readLine();
			System.out.println("My name is: "+str);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}
	
	public void tryCheckUp() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();//It will throw an compile time exception
				
	}

}
