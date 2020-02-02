package seleniuminterviewtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassExample {
	
	WebDriver driver;
	ChromeOptions options;
	Actions action;
	
	@Test(enabled=false)
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://flipkart.com");
		driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
		Thread.sleep(2000);
		System.out.println("Before Title: "+driver.getTitle());
		System.out.println("Before URL: "+driver.getCurrentUrl());
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		WebElement clothing = driver.findElement(By.xpath("//span[text()='Clothing']"));
		action = new Actions(driver);
		Thread.sleep(2000);
		Action act = action.moveToElement(men).click(clothing).build();
		act.perform();
		Thread.sleep(5000);
		System.out.println("After Title: "+driver.getTitle());
		System.out.println("After URL: "+driver.getCurrentUrl());
		driver.close();
		//Actions Class commands
		action.moveToElement(men).keyDown(Keys.ARROW_DOWN).click().build().perform();
		action.keyUp(Keys.ARROW_DOWN).click().build().perform();
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://flipkart.com");
		driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
		Thread.sleep(2000);
		System.out.println("Before Title: "+driver.getTitle());
		System.out.println("Before URL: "+driver.getCurrentUrl());
		List<WebElement> headers = driver.findElements(By.cssSelector("li.Wbt_B2._1YVU3_>span"));
		List<WebElement> headershover = driver.findElements(By.xpath("//span[contains(@class,'_1QZ6f')]//following::li[contains(@class,'_1KCOnI')][1]//a"));
		System.out.println("Headers Size is: "+headers.size());
		System.out.println("Headers Hover Size is: "+headershover.size());
		
		for(int i=0;i<headers.size();i++)
		{
			WebElement headersele = headers.get(i);
			System.out.println("Headers: "+headersele.getText());
			WebElement hoverele = headershover.get(i);
			System.out.println("Headers Hover: "+hoverele.getAttribute("tagName"));
			WebElement mobile = driver.findElement(By.xpath("//*[text()='Mobiles']"));
			action.moveToElement(headersele).click(mobile).build().perform();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("Interger i: "+i+"\n");
			driver.navigate().back();
			headers = driver.findElements(By.cssSelector("li.Wbt_B2._1YVU3_>span"));
			headershover = driver.findElements(By.xpath("//span[contains(@class,'_1QZ6f')]//following::li[contains(@class,'_1KCOnI')][1]//a"));
		}
		driver.close();
	}

}
