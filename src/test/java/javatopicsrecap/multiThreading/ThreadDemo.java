package javatopicsrecap.multiThreading;

/*
 * When create the object of Syed & Qhubaib class first it will give execute Syed Class methods
 * once Syed Class execution completed then Qhubaib class execution will start
 * 
 * Let say i want execute Syed & Qhubaib class both parallely then we need to extend the Thread Class to
 * the respective object created classes.
 * If you extend Thread class - Thread class internally call run() method, So give your method name as run()
 * if you are extending Thread class you need to call start() method
 */

public class ThreadDemo {

	public static void main(String[] args) {

		Syed obj1 = new Syed();
		Qhubaib obj2= new Qhubaib();
		
		obj1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		obj2.start();
	}

}

class Syed extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			System.out.println("Syed");
			try {Thread.sleep(100);} catch(Exception e) {}
		}
	}
}

class Qhubaib extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			System.out.println("Qhubaib");
			try {Thread.sleep(100);} catch(Exception e) {}
		}
	}
}

/*
 * Output before extends Thread Class
Syed
Syed
Syed
Syed
Syed
Qhubaib
Qhubaib
Qhubaib
Qhubaib
Qhubaib

 * Output after extending Thread Class with object.start(); - here start() method internally call run() method
Syed
Qhubaib
Syed
Qhubaib
Syed
Qhubaib
Syed
Qhubaib
Syed
Qhubaib

 * 
*/
