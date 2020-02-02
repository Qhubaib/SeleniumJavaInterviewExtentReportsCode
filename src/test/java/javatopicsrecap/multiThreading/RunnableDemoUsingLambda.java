package javatopicsrecap.multiThreading;

/*
 * NOTE: Runnable interface is @FunctionalInterface so we can use lambda expression
 * 
 * As we are Munna & Ahmed Class once - why cant we use this class inside the interface object
 * 
 * Let say we need to print "Bye" After the execution of obj1 & obj2 -- but in this case if you simply give 
 * syso("Bye") it will execute in between the obj1 & obj2 -- Its because thread t1 AND thread t2 are busy with 
 * doing something where as main() thread is doing nothing, So it will also execute the "Bye".
 * 
 * What we need to do here we need to ask main() thread to complete the task of t1 & t2
 * For this we need to use t1.join(), t2.join() -- it will throw checked exception so we need to handle this
 * 
 * And also we can check whether the thread is alive or not == By using t1.isAlive() method - it will return boolean value
 */

public class RunnableDemoUsingLambda {

	public static void main(String[] args) throws Exception {

		Runnable obj1 = () ->
					{
						for(int i=0;i<5;i++)
						{			
							System.out.println("Munna");
							try {Thread.sleep(100);} catch(Exception e) {}
						}
					};
		Runnable obj2= () ->
					{
						for(int i=0;i<5;i++)
						{			
							System.out.println("Ahmed");
							try {Thread.sleep(100);} catch(Exception e) {}
						}
					};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}

}
/*
 * Before using t1.join() method == Output is ->
 * 
 * Munna
Bye
Ahmed
Munna
Ahmed
Munna
Ahmed
Munna
Ahmed
Munna
Ahmed

After using t1.join() method == outpur is ->

Munna
Ahmed
Munna
Ahmed
Munna
Ahmed
Munna
Ahmed
Munna
Ahmed
Bye


 */







