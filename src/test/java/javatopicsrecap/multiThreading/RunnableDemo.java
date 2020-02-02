package javatopicsrecap.multiThreading;

/*
 * NOTE: Runnable interface is @FunctionalInterface
 * 
 * When a class already extends another class in this scenario we cant extends Thread class
 * So for this instead of Thread we need to use ---- implements Runnable interface
 * 
 * Then you need to create an object of class which implements Runnable interface & also
 * we need to create create an object of Thread class & pass the object of Runnable interface in Thread constructor
 * **************   java.lang.Thread.Thread(Runnable target)    **************** 
 * 
 */

public class RunnableDemo {

	public static void main(String[] args) {

		Runnable obj1 = new Munna();
		Runnable obj2= new Ahmed();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
	}

}

class Munna implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			System.out.println("Munna");
			try {Thread.sleep(100);} catch(Exception e) {}
		}
	}
}

class Ahmed implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{			
			System.out.println("Ahmed");
			try {Thread.sleep(100);} catch(Exception e) {}
		}
	}
}



