package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGGroupsConcept2 {
	
	WebDriver driver;
	
	@Test(groups= {"regression","smoke"})
	public void hasnain()
	{
		System.out.println("This is hasnain related method");
	}
	
	@Test(groups="regression")
	public void qhubaib()
	{
		System.out.println("This is qhubaib related method");
	}
	
	@Test(groups= {"regression","sanity"})
	public void sadaddin()
	{
		System.out.println("This is sadaddin related method");
	}
	
	@Test(groups="smoke")
	public void roshan()
	{
		System.out.println("This is roshan related method");
	}
	
	@Test
	public void flipkart()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("title of flipkart is: "+title);
	}
	
	@Test
	public void google()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("title of google is: "+title);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
