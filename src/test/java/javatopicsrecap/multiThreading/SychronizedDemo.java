package javatopicsrecap.multiThreading;

/*
 * synchronize means thread safe - only one thread will perform the operation on that method
 * 
 * In the below, instead of main thread executing the operation on increment() method lets Thread class will perform on that
 * 
 *  ---> Before using synchronized keyword to method increment() <---- Counter Value is: 1722
 *  Why because here both threads t1 & t2 performing operation on one method, in some situation what both are fetching the
 *  value from count = count+1; -- let say the count of t1 is 600 t2 600 -- so at some point of time both threads may 
 *  try to fetch the value of count at same time. so the output will vary as 1722 (or) 1921 (or) even you can get 2000 also
	---> After using synchronized keyword -----> Counter Value is: 2000
 */

public class SychronizedDemo {

	public static void main(String[] args) throws Exception {

		Counter c=new Counter();

		Runnable obj1 = new Runnable()
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increment();
						}
					}
				};
		Runnable obj2 = new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Counter Value is: "+c.count);
	}

}

class Counter
{
	int count;
	
	public synchronized void increment()
	{
		count++;
	}
}
