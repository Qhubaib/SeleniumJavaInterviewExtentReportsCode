package javatopicsrecap.multiThreading;

/*
 * NOTE: Runnable interface is @FunctionalInterface so we can use lambda expression
 * 
 * As we are Munna & Ahmed Class once - why cant we use this class inside the interface object
 * Below is using Anonymous class
 */

public class RunnableInterfaceUsingAnonymousClass {

	public static void main(String[] args) {

		Runnable obj1 = new Runnable()
				{
					public void run()
					{
						for(int i=0;i<5;i++)
						{			
							System.out.println("Munna");
							try {Thread.sleep(100);} catch(Exception e) {}
						}
					}
				};
		Runnable obj2= new Runnable()
				{
					public void run()
					{
						for(int i=0;i<5;i++)
						{			
							System.out.println("Ahmed");
							try {Thread.sleep(100);} catch(Exception e) {}
						}
					}
				};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
	}

}







