package recapjavatopics;

/*
 * if we want to assign the permission to a particular method -- we use marker interface
 * Ex: Serializable , Remote
 */

public class MarkerInterfaceDemo implements Demo{

	public static void main(String[] args) {
	
		MarkerInterfaceDemo obj = new MarkerInterfaceDemo();

		if(obj instanceof Demo)
		{
			obj.show();
		}
		else
		{
			System.out.println("we cannot call method show if it is not an instance of Demo Interface");
		}
	}
	
	void show()
	{
		System.out.println("This is show method");
	}
	

}

interface Demo
{
	
}
