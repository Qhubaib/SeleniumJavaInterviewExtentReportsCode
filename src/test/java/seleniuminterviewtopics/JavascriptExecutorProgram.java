package seleniuminterviewtopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorProgram {
	
	WebDriver driver;
	ChromeOptions options;
	JavascriptExecutor js;
	
	@Test(enabled=true)
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://flipkart.com");
		driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
		System.out.println("Before Title: "+driver.getTitle());
		System.out.println("Before URL: "+driver.getCurrentUrl());
		WebElement element = driver.findElement(By.className("LM6RPg"));
		WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
		
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow;border:2px solid red;')", element);
		//js.executeScript("arguments[0].value='mobile';",element); it will do send keys operation
		//element.sendKeys("mobile");
		Actions action = new Actions(driver);
		action.sendKeys(element, "lenevo").build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();//this will do two times arrow down operation
		//action.sendKeys(Keys.ENTER).build().perform();//this will do enter operation
		//action.click(submit).build().perform(); it is working properly
		//js.executeScript("arguments[0].click();", submit); it is also working
		System.out.println(driver.getCurrentUrl());
		js.executeScript("alert('hello this is Qhubaib world');");
		Thread.sleep(2000);		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message is: "+ alert.getText());
		alert.accept();
		Thread.sleep(1000);
		driver.close();
		
		//element.sendKeys("mobile");
		
	}

}
