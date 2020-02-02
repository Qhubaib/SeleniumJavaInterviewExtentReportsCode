package recapjavatopics;

/*
 * Overloading - method names must be same & different type of arguments except we no need to check anything like 
 *    access modifiers/return types/throws/static,private,final keywords can also overloaded
 *    Method resolution always takes care by compiler based on reference type
 *    Compiletime polymorphism/static polymorphism/early binding
 *    
 * Overriding - method names must be same with same arguments
 * 	  we cant reduce the scope of access modifiers
 *    whatever the exception child class method throws the exception/it parent must be thrown by parent class methods
 *    if override the static methods then it is considered as method hiding - not overriding
 *    you cant override final,private methods
 *    method resolution always takes care by jvm based on object type
 *    Runtime polymorphism/ dynamic polymorphism/dynamic binding
 *    
 *    
 */

public class Polymorphism {

	public static void main(String[] args) {

		Morphism m = new Morphism();
		m.m();
				
	}

}

class Poly
{
	protected int m()
	{
		System.out.println("This is poly m");
		return 0;
	}
	public void m(int i)
	{
		System.out.println("This is poly m with int");
	}
	
}
class Morphism extends Poly
{
	public int m()
	{
		System.out.println("This is Morphism m");
		return 0;
	}
	public void m(int i)
	{
		System.out.println("This is Morphism m with int");
	}
	
}
