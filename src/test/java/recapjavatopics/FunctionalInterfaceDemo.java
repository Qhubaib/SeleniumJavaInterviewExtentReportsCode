package recapjavatopics;

/*
 * TYPES of Interface
 * 1.Normal Interface
 * 2.Single Abstract mehod interface -- Functional Interface -- can use lambda expression
 * 3.Marker Interface -- which is having no method/empty interface
 */

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Function obj = () -> System.out.println("This is functional interface -- means it is having only one method");
		obj.m1();
					
	}

}

@FunctionalInterface
interface Function
{
	void m1();	
	//void m(); - if we add one more method here after declaring functional interface it will give CE
}
