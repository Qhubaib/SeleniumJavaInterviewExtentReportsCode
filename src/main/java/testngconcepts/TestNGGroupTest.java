package testngconcepts;

import org.testng.annotations.Test;

public class TestNGGroupTest  {
	
	@Test(groups= {"regression"})
	public void method()
	{
		System.out.println("this is method with - regression");
	}
	
	@Test(groups= {"regression","sanity"},expectedExceptions = Exception.class)
	public void method1()
	{
		System.out.println("This is method1 with - regression,sanity");
	}
	
	@Test(groups= {"sanity"})
	public void method2()
	{
		System.out.println("this is method2 with - sanity");
	}

}
